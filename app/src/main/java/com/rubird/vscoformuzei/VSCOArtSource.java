package com.rubird.vscoformuzei;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.google.android.apps.muzei.api.Artwork;
import com.google.android.apps.muzei.api.RemoteMuzeiArtSource;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

import retrofit.ErrorHandler;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.android.AndroidLog;

import com.rubird.vscoformuzei.pojo.*;

/**
 * Created by varunoberoi on 03/06/15.
 */
public class VSCOArtSource extends RemoteMuzeiArtSource {

    private static final String TAG = "VSCOArtSource";
    private static final String SOURCE_NAME = "VSCOArtSource";

    private final int rotateTimeMillis = 2 * 60 * 60 * 1000;

    Map<String, String> ids;

    public VSCOArtSource() {
        super(SOURCE_NAME);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setUserCommands(BUILTIN_COMMAND_ID_NEXT_ARTWORK);
    }

    @Override
    protected void onTryUpdate(int reason) throws RetryException {

        // Check if we cancel the update due to WIFI connection
        if (!Utils.isWifiConnected(this)) {
            if (BuildConfig.DEBUG) Log.d(TAG, "Refresh avoided: no wifi");
            scheduleUpdate(System.currentTimeMillis() + rotateTimeMillis);
            return;
        }

        if(!Utils.isConnected(this)){
            if (BuildConfig.DEBUG) Log.d(TAG, "Refresh avoided: no internet");
            scheduleUpdate(System.currentTimeMillis() + rotateTimeMillis);
            return;
        }

        VSCOArt art = null;

        try {
            ids = Utils.fetchArtFromVSCO();

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://grid.vsco.co")
                    .setLogLevel(RestAdapter.LogLevel.FULL).setLog(new AndroidLog(TAG))
                    .setRequestInterceptor(new RequestInterceptor() {
                        @Override
                        public void intercept(RequestInterceptor.RequestFacade request) {
                            // assuming `cookieKey` and `cookieValue` are not null
                            request.addHeader("Cookie", "vs=" + ids.get("vs").toString());
                        }
                    })
                    .setErrorHandler(new ErrorHandler() {
                        @Override
                        public Throwable handleError(RetrofitError retrofitError) {
                            if (retrofitError.getResponse() == null) {
                                Log.d(TAG, "inside error handler retry exception as no response");
                                return retrofitError;
                            }
                            int statusCode = retrofitError.getResponse().getStatus();
                            if (retrofitError.getKind() == RetrofitError.Kind.NETWORK
                                    || (500 <= statusCode && statusCode < 600)) {
                                Log.d(TAG, "inside error handler retry exception");
                                return new RetryException();
                            }
                            if (rotateTimeMillis != -1)
                                scheduleUpdate(System.currentTimeMillis() + rotateTimeMillis);
                            Log.d(TAG, "inside error handler returning error");
                            return retrofitError;
                        }
                    })
                    .build();

            VSCOService service = restAdapter.create(VSCOService.class);
            VSCOGrid response;
            Random randomGenerator = new Random();
            try {
                response = service.getWalls(ids.get("vs").toString(), randomGenerator.nextInt(3000),ids.get("siteId").toString());
                art = new VSCOArt();
                art.picture = "http://" + (response.getMedia().get(0).getResponsiveUrl().replace("\\",""));
                art.author = response.getMedia().get(0).getGridName()+"("+response.getMedia().get(0).getPermaDomain()+")";
                art.link = (response.getMedia().get(0).getPermalink().replace("\\",""));
                art.id = response.getMedia().get(0).getId();
                art.title = response.getMedia().get(0).getDescription();
            }catch(RetrofitError e){
                e.printStackTrace();
                throw new RetryException();
            }

        } catch (IOException e) {
            e.printStackTrace();
            new RetryException();
        }

        publishArtwork(new Artwork.Builder()
                .title(art.title)
                .byline(art.author)
                .imageUri(Uri.parse(art.picture))
                .token(art.link)
                .viewIntent(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(art.link)))
                .build());

        scheduleUpdate(System.currentTimeMillis() + rotateTimeMillis);
    }
}

package com.rubird.vscoformuzei;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by varunoberoi on 03/06/15.
 */
public class Utils {

    public final static String TAG = "Utils";
    public static String rootUrl = "http://grid.vsco.co/grid/1";

    // Fetch an image from VSCO Grid
    static Map<String, String> fetchArtFromVSCO() throws IOException {

        Log.d(TAG, "Parsing: " + rootUrl);

        Connection connection = Jsoup.connect(rootUrl);

        Document doc = connection.get();
        Connection.Response response = connection.response();
        Map<String, String> cookies = response.cookies();

        String vs = cookies.get("vs").toString(), siteId = doc.head().html().split(",\"id\":")[1].split(",\"name\":")[0];

        Map<String, String> map = new HashMap<String, String>();
        map.put("vs", vs);
        map.put("siteId", siteId);

        return map;
    }

    /**
     * Determines if the WIFI is connected
     * @param context the needed Context
     * @return true if connected
     */
    public static boolean isWifiConnected(Context context)
    {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        return  mWifi.isConnected();
    }

    /**
     * Determines if the INTERNET is connected
     * @param context the needed Context
     * @return true if connected
     */
    public static boolean isConnected(Context context)
    {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

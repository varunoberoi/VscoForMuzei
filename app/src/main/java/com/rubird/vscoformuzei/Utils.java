package com.rubird.vscoformuzei;

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
}

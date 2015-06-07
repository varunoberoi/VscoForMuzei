package com.rubird.vscoformuzei;

import com.rubird.vscoformuzei.pojo.VSCOGrid;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by varunoberoi on 05/06/15.
 */
interface VSCOService {
    @GET("/ajxp/{vs}/2.0/medias?size=1")
    VSCOGrid getWalls(@Path("vs") String vs, @Query("page") Integer page, @Query("site_id") String siteId);
}
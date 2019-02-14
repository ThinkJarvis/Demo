package com.app.demo;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiService {
    //https://bqc53gw-pros.pateo.com.cn/cp/radio/ondemand/albumsBrowse?devicetype=DT00000001&clientOsType=2&packId=com.ximalaya.ting.android.botaichezai&deviceId=P007000900000348&albumId=203355&calcDimension=1&page=1&count=20
    @GET("ondemand/albumsBrowse")
    Flowable<XmlyTracksByAlbum> getTracksByAlbum(@Header("Authorization") String token, @Query("devicetype") String deviceType, @Query("clientOsType") int clientOsType,
                                                 @Query("packId") String packId, @Query("deviceId") String deviceId,
                                                 @Query("albumId") int albumId, @Query("calcDimension") int calcDimension,
                                                 @Query("page") int page, @Query("count") int count);
}

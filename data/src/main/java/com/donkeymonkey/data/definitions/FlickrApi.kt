package com.donkeymonkey.data.definitions

import com.donkeymonkey.domain.entities.photos.RecentPhotos
import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrApi
{
    //TODO change to handle error as well
    @GET("/services/rest/")
    suspend fun getRecentPhotos(
        @Query("method") method: String,
        @Query("format") format: String,
        @Query("enable_page") enable_page: String,
        @Query("param_per_page") param_per_page: Int,
        @Query("param_per") param_per: Int,
        @Query("nojsoncallback") nojsoncallback: Int,
    ): RecentPhotos
}
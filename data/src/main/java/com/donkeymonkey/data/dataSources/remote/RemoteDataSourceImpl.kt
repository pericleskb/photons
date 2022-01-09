package com.donkeymonkey.data.dataSources.remote

import com.donkeymonkey.data.definitions.FlickrApi
import com.donkeymonkey.domain.entities.photos.RecentPhotos

class RemoteDataSourceImpl(
    private val flickrApi: FlickrApi
): RemoteDataSource {
    override suspend fun getPhotos(): RecentPhotos {
        return flickrApi.getRecentPhotos(
            "flickr.photos.getRecent",
            "json",
            "on",
            10,
            1,
            1
        )
    }
}
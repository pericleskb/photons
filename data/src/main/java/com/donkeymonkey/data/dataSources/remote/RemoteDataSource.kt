package com.donkeymonkey.data.dataSources.remote

import com.donkeymonkey.domain.entities.photos.RecentPhotos

interface RemoteDataSource {
    suspend fun getPhotos(): RecentPhotos
}
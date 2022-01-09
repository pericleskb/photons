package com.donkeymonkey.data.repositories

import com.donkeymonkey.data.dataSources.remote.RemoteDataSource
import com.donkeymonkey.domain.entities.photos.Photo
import com.donkeymonkey.domain.repositories.PhotosRepository

class PhotosRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): PhotosRepository {

    override suspend fun getRecentPhotos(): List<Photo> {
        return remoteDataSource.getPhotos().photos.photoList;
    }
}
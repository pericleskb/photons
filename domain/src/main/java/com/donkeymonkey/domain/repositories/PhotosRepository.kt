package com.donkeymonkey.domain.repositories

import com.donkeymonkey.domain.entities.photos.Photo

interface PhotosRepository {
    suspend fun getRecentPhotos(): List<Photo>
}
package com.donkeymonkey.photons.core.domain.repositories

import com.donkeymonkey.photons.core.domain.entities.photos.Photo

interface PhotosRepository {
    suspend fun getRecentPhotos(): List<Photo>
}
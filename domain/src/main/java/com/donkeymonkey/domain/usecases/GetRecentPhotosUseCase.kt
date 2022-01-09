package com.donkeymonkey.domain.usecases

import com.donkeymonkey.domain.repositories.PhotosRepository

class GetRecentPhotosUseCase(private val photosRepository: PhotosRepository) {
    suspend operator fun invoke() { photosRepository.getRecentPhotos() }
}
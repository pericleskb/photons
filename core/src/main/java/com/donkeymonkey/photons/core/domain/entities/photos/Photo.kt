package com.donkeymonkey.photons.core.domain.entities.photos

import com.donkeymonkey.photons.core.domain.definitions.DataTypeDefinitions
import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id") val id: String,
    @SerializedName("owner") val owner: String,
    @SerializedName("secret") val secret: String,
    @SerializedName("serverId") val serverId: String,
    @SerializedName("farm") val farm: Int,
    @SerializedName("title") val title: String
) {
    private val flickrImageUrl = "https://live.staticflickr.com/"

    fun getImageUrl(sizeSuffix: String = DataTypeDefinitions.DEFAULT_STRING): String {
        return "$flickrImageUrl/${serverId}/${id}_$secret${getSizeSuffix(sizeSuffix)}"
    }

    private fun getSizeSuffix(sizeSuffix: String): String {
        return if (sizeSuffix != DataTypeDefinitions.DEFAULT_STRING) "_$sizeSuffix" else ""
    }
}
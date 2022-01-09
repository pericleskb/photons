package com.donkeymonkey.domain.entities.photos

import com.google.gson.annotations.SerializedName

//Server side models, live here
data class RecentPhotos(
    @SerializedName("photos") val photos: PhotosPaging
)

class PhotosPaging(
    @SerializedName("page") val page: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("perPage") val perPage: Int,
    @SerializedName("total") val total: Int,
    @SerializedName("photo") val photoList: List<Photo>
)
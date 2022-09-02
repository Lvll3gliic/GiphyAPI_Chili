package com.example.chili_giphy

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("data") val res: List<DataObject>
)
data class DataObject(
    @SerializedName("images") val images: DataImage
)
data class DataImage(
    @SerializedName("original") val originalImage: OriginalImage
)

data class OriginalImage(
    val url: String
)
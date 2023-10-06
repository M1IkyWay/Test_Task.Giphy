package com.example.testtaskgiphy

import com.google.gson.annotations.SerializedName

//data class GifImage(val gifUrl : String)
//
data class ListResult (
    @SerializedName ("data") val res : List<GifObject>
)

data class GifObject (
    @SerializedName ("images") val images : GifImage
)

data class GifImage (
    @SerializedName ("original") val origImage: OrigImage
)

data class OrigImage (
    val url : String
)

{

}

package com.example.matchessimulator

import android.media.Image
import com.google.gson.annotations.SerializedName

data class team(
    @SerializedName("name")
    val nome : String,

    @SerializedName("forca")
    val stars: Int,

    @SerializedName("imagem")
    val image: String,
)

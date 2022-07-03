package com.example.matchessimulator

import com.google.gson.annotations.SerializedName

data class match(
    @SerializedName("descricao")
    val  description: String,
    @SerializedName("local")

    val place :place,
    @SerializedName("mandante")

    val homeTeam: String,
    @SerializedName("visitante")

    val awayTeam: String

)

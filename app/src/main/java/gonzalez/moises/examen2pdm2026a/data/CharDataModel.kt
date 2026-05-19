package gonzalez.moises.examen2pdm2026a.data

import com.google.gson.annotations.SerializedName

data class CharDataModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,       // <-- Ponle ? por si acaso
    @SerializedName("image") val image: String?,     // <-- El ? es vital aquí
    @SerializedName("gender") val gender: String?,   // <-- Ponle ?
    @SerializedName("firstEpisode") val firstEpisode: String? // <-- Ponle ?
)
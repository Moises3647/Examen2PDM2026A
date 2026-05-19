package gonzalez.moises.examen2pdm2026a.network

import gonzalez.moises.examen2pdm2026a.data.CharDataModel
import retrofit2.http.GET

interface CharAPIS{
    @GET("characters")
    suspend fun getCharacters(): List<CharDataModel>
}

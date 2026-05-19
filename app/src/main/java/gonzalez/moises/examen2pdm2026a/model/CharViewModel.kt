package gonzalez.moises.examen2pdm2026a.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gonzalez.moises.examen2pdm2026a.data.CharDataModel
import gonzalez.moises.examen2pdm2026a.network.CharAPIS
import kotlinx.coroutines.launch
import retrofit2.converter.gson.GsonConverterFactory
import androidx.compose.runtime.State
import retrofit2.Retrofit

class CharViewModel : ViewModel() {
    private val api = Retrofit.Builder()
        .baseUrl("https://bobsburgers-api.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CharAPIS::class.java)

    private val _characters = mutableStateOf<List<CharDataModel>>(emptyList())
    val characters: State<List<CharDataModel>> = _characters

    // 3. Al iniciar el ViewModel, llamamos automáticamente al API en un hilo seguro
    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            try {
                val result = api.getCharacters()
                _characters.value = result // Guardamos los personajes en el estado
            } catch (e: Exception) {
                _characters.value = emptyList()
            }
        }
    }
}

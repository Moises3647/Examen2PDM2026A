package gonzalez.moises.examen2pdm2026a.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import gonzalez.moises.examen2pdm2026a.data.CharDataModel
import gonzalez.moises.examen2pdm2026a.model.CharViewModel

@Composable
fun Char_Screen(viewModel: CharViewModel)
{
    val characters = viewModel.characters.value
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp))
    {
        items(characters)
        {
            character -> CharacterCard(character)
        }
    }

}

@Composable
fun CharacterCard(character: CharDataModel)
{
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(8.dp)
        )
            {
                AsyncImage(
                    model = character.image,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop
                    )
                Column(modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(text = "Nombre: ${character.name?.replace("\"", "") ?: "Desconocido"}")

                    Text(text = "Sexo: ${character.gender ?: "No especificado"}")

                    // CORRECCIÓN: Lo mismo aquí para el primer episodio
                    Text(text = "Primer Episodio: ${character.firstEpisode?.replace("\"", "") ?: "No registrado"}")
                }
            }
    }
}
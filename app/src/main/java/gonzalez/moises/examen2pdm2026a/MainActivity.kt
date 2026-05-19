package gonzalez.moises.examen2pdm2026a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import gonzalez.moises.examen2pdm2026a.composables.Char_Screen
import gonzalez.moises.examen2pdm2026a.model.CharViewModel
import gonzalez.moises.examen2pdm2026a.ui.theme.Examen2PDM2026ATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen2PDM2026ATheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                        // AL SOLUCIONAR ESTA LÍNEA CON viewModel(), EL SCROLL YA NO ROMPERÁ LA APP
                        val mViewModel: CharViewModel = viewModel()

                        Box(modifier = Modifier.padding(padding)) {
                            Char_Screen(viewModel = mViewModel)
                        }
                    }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Examen2PDM2026ATheme {
        Greeting("Android")
    }
}
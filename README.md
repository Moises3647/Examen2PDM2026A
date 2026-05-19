# Examen2PDM2026A

Este proyecto es una aplicación Android desarrollada para el segundo examen parcial de Programación de Dispositivos Móviles (PDM). La aplicación consume la API de Bob's Burgers para mostrar una lista de personajes.

## 🚀 Características

- **Consumo de API REST:** Utiliza Retrofit para obtener datos de personajes desde `https://bobsburgers-api.herokuapp.com/`.
- **Interfaz Moderna:** Construida totalmente con **Jetpack Compose**.
- **Arquitectura MVVM:** Separación clara de responsabilidades entre la UI y la lógica de datos.
- **Carga de Imágenes:** Implementación de la librería **Coil** para la carga asíncrona de imágenes desde URLs.
- **Manejo de Estados:** Uso de `ViewModel` y `State` para gestionar el ciclo de vida de los datos.

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Kotlin
- **UI:** Jetpack Compose
- **Network:** Retrofit 2 & Gson
- **Imágenes:** Coil
- **Asincronía:** Corrutinas de Kotlin y Flow/State
- **Arquitectura:** ViewModel & LiveData/State

## 📦 Estructura del Proyecto

- `network/`: Contiene la interfaz de Retrofit (`CharAPIS.kt`) para las llamadas al endpoint.
- `data/`: Modelos de datos (`CharDataModel.kt`) que representan la respuesta de la API.
- `model/`: Lógica de negocio y gestión de estado con `CharViewModel.kt`.
- `composables/`: Componentes visuales como `CharScreen.kt` y `CharacterCard`.

## ⚙️ Configuración

Para ejecutar este proyecto localmente:

1. Clona el repositorio.
2. Abre el proyecto en **Android Studio**.
3. Asegúrate de tener conexión a internet (para las peticiones a la API).
4. Ejecuta la aplicación en un emulador o dispositivo físico.

---
**Desarrollado por:** Moises Gonzalez

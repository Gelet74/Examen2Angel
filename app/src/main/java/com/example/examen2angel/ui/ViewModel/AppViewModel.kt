package com.example.examen2angel.ui.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.examen2angel.modelo.AppUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AppViewModel: ViewModel() {
    private val _appUItate = MutableStateFlow(AppUIState())
    val appUIState: StateFlow<AppUIState> = _appUItate.asStateFlow()

    var respuestaNumero1 by mutableStateOf("")
        private set

    var respuestaNumero2 by mutableStateOf("")
        private set

    fun actualizarNumero1(num: String) {
        respuestaNumero1 = num

        _appUItate.update { estadoActual ->
            estadoActual.copy(
                numero1 = respuestaNumero1
            )
        }
    }

    fun actualizarNumero2(num: String) {
        respuestaNumero2 = num

        _appUItate.update { estadoActual ->
            estadoActual.copy(
                numero2 = respuestaNumero2
            )
        }
    }
}
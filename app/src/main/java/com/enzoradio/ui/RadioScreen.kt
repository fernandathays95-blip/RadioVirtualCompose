package com.enzoradio.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RadioScreen(isPTT: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = if (isPTT.value) "PTT Ativado: Falando..." else "PTT Desativado",
            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { /* Aqui poderia enviar código Morse */ }) {
            Text("Enviar Código Morse (Volume -)")
        }
    }
}

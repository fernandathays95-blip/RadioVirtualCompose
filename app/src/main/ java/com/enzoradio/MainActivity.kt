package com.enzoradio

import android.os.Bundle
import android.view.KeyEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.enzoradio.ui.RadioScreen

class MainActivity : ComponentActivity() {

    private var isPTT = mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                RadioScreen(isPTT)
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_VOLUME_UP -> {
                if (!isPTT.value) {
                    isPTT.value = true
                    // Aqui você pode começar a gravar e enviar áudio
                }
                return true
            }
            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                // Aqui envia código Morse
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            isPTT.value = false
            // Para de gravar/enviar áudio
            return true
        }
        return super.onKeyUp(keyCode, event)
    }
}

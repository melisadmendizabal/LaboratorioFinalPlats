package com.uvg.laboratoriofinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.laboratoriofinal.presentation.AssetsNavHost
import com.uvg.laboratoriofinal.ui.theme.LaboratorioFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaboratorioFinalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AssetsNavHost(Modifier.padding(innerPadding))
                }
            }
        }
    }
}


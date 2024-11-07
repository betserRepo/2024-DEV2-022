package com.bnptest.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.bnptest.tictactoe.composable.GameBoard
import com.bnptest.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TicTacToeTheme {
                Scaffold { innerPadding ->
                    GameBoard(
                        Modifier
                            .fillMaxSize()
                            .padding(innerPadding))
                }
            }
        }
    }
}

package com.bnptest.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.bnptest.tictactoe.composable.GameBoard
import com.bnptest.tictactoe.ui.theme.TicTacToeTheme
import com.bnptest.tictactoe.usecases.GameUseCaseImpl
import com.bnptest.tictactoe.viewmodel.GameViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: GameViewModel by viewModels {
        GameViewModel.Companion.Factory(GameUseCaseImpl())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TicTacToeTheme {
                Scaffold { innerPadding ->
                    GameBoard(
                        viewModel = viewModel,
                        Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

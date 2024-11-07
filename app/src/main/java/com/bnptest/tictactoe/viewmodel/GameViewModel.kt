package com.bnptest.tictactoe.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bnptest.tictactoe.intents.GameIntent
import com.bnptest.tictactoe.states.GameState
import com.bnptest.tictactoe.usecases.GameUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GameViewModel(private val useCase: GameUseCase) : ViewModel() {

    private val _state = MutableStateFlow(GameState())
    val state: StateFlow<GameState> get() = _state.asStateFlow()

    fun handleIntent(intent: GameIntent) {
        viewModelScope.launch {
            val newState = when (intent) {
                is GameIntent.MakeMove -> useCase.makeMove(
                    _state.value,
                    intent.row,
                    intent.col
                )

                is GameIntent.ResetGame -> useCase.resetGame()
            }
            _state.value = newState
        }
    }

    companion object {
        class Factory(private val useCase: GameUseCase) :
            ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
                    @Suppress("UNCHECKED_CAST")
                    return GameViewModel(useCase) as T
                }
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
    }
}
package com.bnptest.tictactoe.usecases

import com.bnptest.tictactoe.states.GameState

interface GameUseCase {
    fun makeMove(state: GameState, row: Int, col: Int): GameState
    fun resetGame(): GameState
}

package com.bnptest.tictactoe.intents

sealed class GameIntent {
    data class MakeMove(val row: Int, val col: Int) : GameIntent()
    object ResetGame : GameIntent()
}
package com.bnptest.tictactoe.states

import com.bnptest.tictactoe.objects.Player
import com.bnptest.tictactoe.objects.SquareState
import com.bnptest.tictactoe.objects.WinnerState

data class GameState(
    val board: List<List<SquareState>> = List(3) { List(3) { SquareState.NONE } },
    val currentPlayer: Player = Player.X,
    val winner: WinnerState? = null
)

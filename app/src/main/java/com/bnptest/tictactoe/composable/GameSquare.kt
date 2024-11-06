package com.bnptest.tictactoe.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bnptest.tictactoe.states.SquareState
import com.bnptest.tictactoe.ui.theme.TicTacToeTheme
import com.bnptest.tictactoe.utils.Spacing.x0_125
import com.bnptest.tictactoe.utils.Spacing.x5

@Composable
internal fun GameSquare(
    modifier: Modifier = Modifier,
    state: SquareState = SquareState.NONE,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .width(x5)
            .height(x5)
            .clickable(onClick = onClick)
            .border(x0_125, MaterialTheme.colorScheme.outline),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = when (state) {
                SquareState.NONE -> ""
                SquareState.O -> "O"
                SquareState.X -> "X"
            },
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Preview
@Composable
private fun preview() {
    TicTacToeTheme {
        Row {
            GameSquare(state = SquareState.O, onClick = {})
        }
    }
}
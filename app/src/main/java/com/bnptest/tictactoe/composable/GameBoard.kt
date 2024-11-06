package com.bnptest.tictactoe.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bnptest.tictactoe.ui.theme.TicTacToeTheme
import com.bnptest.tictactoe.utils.Spacing.x0_125

@Composable
fun GameBoard(
    modifier: Modifier = Modifier,
    onCellClick: (Int, Int) -> Unit,
) {
    Column(
        modifier = modifier
    ) {
        for (row in 0..2) {
            Row {
                for (col in 0..2) {
                    GameSquare (
                        modifier = Modifier.padding(
                            x0_125
                        )
                    ) {
                        onCellClick(row, col)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun preview() {
    TicTacToeTheme {
        GameBoard { _, _ -> }
    }
}

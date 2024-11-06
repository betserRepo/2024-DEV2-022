package com.bnptest.tictactoe

import org.junit.Test

import org.hamcrest.MatcherAssert.assertThat

class GameUnitTest {

    @Test
    fun playerXGoesFirst() {
        assertThat("Is PlayerX first", false)
    }

    @Test
    fun playerCannotPlayOnPlayedPosition() {
        assertThat("Player cannot play on played position", false)
    }

    @Test
    fun playersAlternate() {
        assertThat("Players alternate", false)
    }

    @Test
    fun winnerIsDetected() {
        assertThat("Winner is detected", false)
    }

    @Test
    fun winnerByDiagonal() {
        assertThat("Winner by diagonal", false)
    }

    @Test
    fun winnerByHorizontal() {
        assertThat("Winner by horizontal", false)
    }

    @Test
    fun winnerByVertical() {
        assertThat("Winner by vertical", false)
    }

    @Test
    fun draw() {
        assertThat("draw when squares are filled", false)
    }
}

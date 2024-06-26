package com.taqiyuddinj.tictactoe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void testGetName() throws Exception {
        final String testValue = "The One";
        final String expectedValue = "The One";
        final Player player = new Player(testValue, Figure.O);
        assertEquals(expectedValue, player.getName());
    }

    @Test
    public void testGetFigure() throws Exception {
        final String playerName = "The One";
        final Figure testValue = Figure.O;
        final Figure expectedValue = Figure.O;
        final Player player = new Player(playerName, testValue);
        assertEquals(expectedValue, player.getFigure());

    }
}

package com.taqiyuddinj.tictactoe.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {
    
    @Test
    public void testToString() throws Exception {
        final Figure figureO = Figure.O;
        final Figure figureX = Figure.X;
        final String expectedO = "O";
        final String expectedX = "X";
        assertEquals(expectedO,figureO.toString());
        assertEquals(expectedX,figureX.toString());
    }
}

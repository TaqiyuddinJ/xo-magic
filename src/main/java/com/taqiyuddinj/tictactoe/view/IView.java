package com.taqiyuddinj.tictactoe.view;

import com.taqiyuddinj.tictactoe.controller.GameController;
import com.taqiyuddinj.tictactoe.model.Point;
import com.taqiyuddinj.tictactoe.model.exceptions.InvalidPointException;

public interface IView {
    
    public Point startTurn();

    public void showGameName();

    public void showPlayers();

    public void showBoard();

    public void showWinner();

    public void showDraw();

    public void anotherGame();

    public void showPointOccupied();

    public GameController getGameController();

}

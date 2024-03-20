package com.taqiyuddinj.tictactoe.controller;

import com.taqiyuddinj.tictactoe.model.Player;
import com.taqiyuddinj.tictactoe.model.Point;
import com.taqiyuddinj.tictactoe.model.exceptions.PointOccupiedException;
import com.taqiyuddinj.tictactoe.view.IView;

public class Game {
    
    final private IView iview;
    final private GameController gameController;

    public Game(IView iview) {
        this.iview = iview;
        this.gameController = iview.getGameController();
    }

    public void theGame() {
        while (gameController.getNextTurn()) {
            Point point = iview.startTurn();
            try {
                Player currentPlayer = gameController.getCurrentPlayer(gameController.getPlayers()[0]);
                gameController.move(point.getX(), point.getY(), currentPlayer);
            } catch (PointOccupiedException e) {
                iview.showPointOccupied();
            }
            iview.showBoard();
        }
        if (gameController.getWinner() != null) {
            iview.showWinner();
            iview.anotherGame();
        } else {
            iview.showDraw();
            iview.anotherGame();
        }
    }

    protected GameController getGameController() {
        return gameController;
    }
}

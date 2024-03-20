# XO Magic - A Simple Tic-Tac-Toe Game

## Introduction

XO Magic is a simple tic-tac-toe game implemented in Java. The game allows two players to play against each other on a board of varying sizes. The game follows the standard rules of tic-tac-toe, with the first player to get three of their symbols in a row, column, or diagonal winning the game.

## Gameplay

To play the game, the user can choose from the following options:

- **Play**: Start a new game with the default settings.
- **Load**: Load a previously saved game.
- **Set up and play**: Customize the game settings, such as the board size and player names.
- **Exit**: Quit the game.

When playing a new game, the players are prompted to enter their names. The game then displays the game name and the players' figures. The game alternates turns between the players, with each player entering their move by specifying the coordinate of the figure they wish to place.

## Board View

The board view is displayed in a grid format, with each row and column separated by a horizontal line. The figures are represented by their respective symbols, with an empty space denoted by a single space.

## Game Over

The game ends when one player gets three of their symbols in a row, column, or diagonal. The game will then display the winner's name and ask if the user wants to play another game.

## Customization

The game allows the user to customize the board size and player names when setting up and playing the game. The board size can be set to any odd number between 3 and 9, inclusive.

## Running the Game

To run the game, you will need to have Java installed on your system. Simply compile and run the `ConsoleView` class, and the game will start.

## Dependencies

This game uses the following dependencies:

- Java 8 or later
- Spring Boot 2.7.0 or later

## License

This game is released under the MIT License. Feel free to use, modify, and distribute the game as you see fit.
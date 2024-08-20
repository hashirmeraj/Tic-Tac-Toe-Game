# Tic Tac Toe Game

This is a simple Tic Tac Toe game implemented in Java using the Swing framework for the graphical user interface (GUI). The game is designed for two players, with one player as "X" and the other as "O".

## Features

- **Graphical Interface**: The game features a simple and intuitive GUI built with Java Swing.
- **Two Players**: The game allows two players to play against each other on the same computer.
- **Winner Detection**: The game automatically detects when a player has won by completing a row, column, or diagonal.
- **Draw Detection**: The game also detects when all tiles are filled and the game ends in a draw.
- **Color Indicators**: The winning combination is highlighted in green when a player wins.

## How to Run

To run the Tic Tac Toe game, you need to have Java installed on your system. Follow these steps to execute the game:

1. **Clone the Repository**: If you haven't cloned the repository yet, clone it to your local machine using the following command:
    ```bash
    git clone https://github.com/yourusername/tictactoe-java.git
    ```

2. **Navigate to the Project Directory**:
    ```bash
    cd tictactoe-java
    ```

3. **Compile the Java File**:
    ```bash
    javac TicTacToe.java
    ```

4. **Run the Game**:
    ```bash
    java TicTacToe
    ```

## Code Overview

The game consists of a single Java file, `TicTacToe.java`, which contains the following key components:

- **`TicTacToe` Class**: This is the main class that initializes the game, sets up the GUI, and handles game logic.
- **`checkWinner()` Method**: This method checks for a winning combination or a draw after each move.
- **`setWinner(JButton... tiles)` Method**: This method is called when a winning combination is detected, highlighting the winning tiles and displaying the winner.
- **`main` Method**: The entry point of the game, which creates an instance of the `TicTacToe` class and starts the game.

## Customization

- **Change Player Symbols**: You can change the player symbols ("X" and "O") by modifying the `playerX` and `playerO` variables.
- **Change GUI Appearance**: The appearance of the game (e.g., colors, fonts) can be customized by altering the properties of the Swing components in the constructor of the `TicTacToe` class.

## License

This project is open-source and available under the MIT License. Feel free to use, modify, and distribute the code as per the license terms.

## Author

- [Hashir Meraj](https://github.com/hashirmeraj)


package com.bptn.course.challenge._03_week.four_in_a_row_game._05_part;

import java.util.Scanner;

public class Game {
    private Board board; // The game board
    private Player[] players; // Array of players
    private int currentPlayerIndex; // Index of the current player
    private int size; // Size of the board
    private int winCondition; // Winning condition
    private int gameTime; // Game timer in seconds

    // Constructor
    public Game(int size, int winCondition, String player1Name, String player2Name, int gameTime) {
        this.size = size;
        this.winCondition = winCondition;
        this.gameTime = gameTime;
        board = new Board(size); // Create the board
        players = new Player[2]; // Assuming two players
        players[0] = new Player(player1Name, 'X'); // Player 1
        players[1] = new Player(player2Name, 'O'); // Player 2
        currentPlayerIndex = 0; // Start with the first player
    }

    // Method to start the game
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis(); // Start timer
        while (true) {
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000; // Calculate elapsed time
            if (elapsedTime >= gameTime) {
                System.out.println("Time's up! Game over.");
                break;
            }

            board.display(); // Show the current board
            Player currentPlayer = players[currentPlayerIndex]; // Get current player
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getToken() + ").");

            // Get move from the player
            System.out.print("Enter row and column to place your token (e.g., 1 2) or 'u' to undo: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("u")) {
                board.undo(); // Undo the last move
                System.out.println("Last move undone.");
                continue;
            }

            String[] parts = input.split(" "); // Split input for row and column
            if (parts.length != 2) {
                System.out.println("Invalid input! Please enter row and column.");
                continue;
            }

            try {
                int row = Integer.parseInt(parts[0]) - 1; // Adjust for 0-based indexing
                int col = Integer.parseInt(parts[1]) - 1;

                if (board.placeToken(row, col, currentPlayer.getToken())) {
                    if (board.checkWin(currentPlayer.getToken(), winCondition)) {
                        board.display(); // Show the final board
                        System.out.println(currentPlayer.getName() + " wins!");
                        break; // End the game on win
                    }
                    // Switch players
                    currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // Change to next player
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers for row and column.");
            }
        }
        scanner.close(); // Close the scanner
    }
}

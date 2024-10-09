package com.bptn.course.challenge._03_week.four_in_a_row_game._05_part;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private char[][] grid; // 2D array for the board
    private int size; // Size of the board
    private List<int[]> moves; // List to keep track of moves for undoing

    // Constructor
    public Board(int size) {
        this.size = size;
        grid = new char[size][size]; // Create the board
        moves = new ArrayList<>(); // Initialize the list of moves
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '.'; // Fill the board with dots (empty spaces)
            }
        }
    }

    // Method to display the board
    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " "); // Print each cell
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to place a token
    public boolean placeToken(int row, int col, char token) {
        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '.') {
            grid[row][col] = token; // Place the token
            moves.add(new int[]{row, col}); // Track the move
            return true; // Successful placement
        }
        return false; // Placement failed
    }

    // Method to undo the last move
    public void undo() {
        if (!moves.isEmpty()) {
            int[] lastMove = moves.remove(moves.size() - 1); // Get last move
            grid[lastMove[0]][lastMove[1]] = '.'; // Reset that position
        } else {
            System.out.println("No moves to undo.");
        }
    }

    // Check if a player has won
    public boolean checkWin(char token, int winCondition) {
        // Check rows, columns, and diagonals for win condition
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == token) {
                    // Check horizontally
                    if (j + winCondition - 1 < size && checkDirection(i, j, 0, 1, token, winCondition)) return true;
                    // Check vertically
                    if (i + winCondition - 1 < size && checkDirection(i, j, 1, 0, token, winCondition)) return true;
                    // Check diagonal down-right
                    if (i + winCondition - 1 < size && j + winCondition - 1 < size && checkDirection(i, j, 1, 1, token, winCondition)) return true;
                    // Check diagonal down-left
                    if (i + winCondition - 1 < size && j - (winCondition - 1) >= 0 && checkDirection(i, j, 1, -1, token, winCondition)) return true;
                }
            }
        }
        return false; // No winner found
    }

    // Helper method to check a specific direction for a win
    private boolean checkDirection(int row, int col, int rowDir, int colDir, char token, int count) {
        for (int k = 0; k < count; k++) {
            if (grid[row + k * rowDir][col + k * colDir] != token) {
                return false;
            }
        }
        return true;
    }
}

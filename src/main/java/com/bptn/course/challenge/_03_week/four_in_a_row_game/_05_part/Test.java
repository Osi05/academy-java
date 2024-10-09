package com.bptn.course.challenge._03_week.four_in_a_row_game._05_part;

public class Test {
    public static void main(String[] args) {
        // Create an instance of the Game
        Game fourInARowGame = new Game(5, 4, "Player 1", "Player 2", 30); // 5x5 board, 4 in a row to win, 30 seconds timer
        fourInARowGame.startGame(); // Start the game
    }
}

package com.bptn.course.challenge._03_week.four_in_a_row_game._05_part;

public class Player {
    private String name; // Player's name
    private char token;  // Player's token ('X' or 'O')

    // Constructor
    public Player(String name, char token) {
        this.name = name;
        this.token = token;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for token
    public char getToken() {
        return token;
    }
}

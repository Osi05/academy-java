package com.bptn.course.challenge._04_week;

public class HiddenWord {

    // Instance variable to store the hidden word
    private String hiddenWord;

    // Constructor that sets the hidden word
    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    // Method to generate a hint based on the player's guess
    public String getHint(String guess) {
        String hint = "";  // The hint that will be built and returned
        boolean[] visited = new boolean[hiddenWord.length()];  // Tracks which letters have been matched in hiddenWord

        // First pass: check for correct letter positions
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                hint += guess.charAt(i);  // Correct letter in correct position
//                visited[i] = true;  // Mark the letter as visited
            } else {
                hint += "*";  // Placeholder for now
            }
        }

        // Second pass: check for letters in wrong positions
        for (int i = 0; i < guess.length(); i++) {
            if (hint.charAt(i) == '*') {  // Only check letters that haven't matched yet
                char guessChar = guess.charAt(i);
                for (int j = 0; j < hiddenWord.length(); j++) {
                    // Check if the character exists in hiddenWord and hasn't been used
                    if (guessChar == hiddenWord.charAt(j) && !visited[i]) {
                        hint = hint.substring(0, i) + "+" + hint.substring(i + 1);  // Replace '*' with '+'
                        visited[j] = true;  // Mark the character as visited
                        break;  // Stop after the first match
                    }
                }
            }
        }

        return hint;  // Return the final hint
    }

    // Main method for testing the class
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        
        // Test cases to verify the solution
        System.out.println(puzzle.getHint("AAAAA") + " should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " should print H****");
        System.out.println(puzzle.getHint("HEART") + " should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " should print HARPS");
    }
}

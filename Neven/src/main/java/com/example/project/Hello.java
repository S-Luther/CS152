package com.example.project;

public class Hello {

    // ◯ ●
    public static void main(String[] args) {
        // Initialize the 2d board to be 19 x 19
        String[][] board = new String[19][19];

        // Loop through the 2d board, assigning each index a string element
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                // This is the first random location where I'll store one of the pieces
                if (j == 14 && i == 4) {
                    board[i][j] = "|-●";
                // This is the second random location where I'll store one of the pieces    
                } else if (j == 7 && i == 8) {
                    board[i][j] = "|-◯";
                }//Otherwise, print the normal grid
                else
                {
                    board[i][j] = "|-|";
                }
                
            }

        }

        // This code block will loop through the 2d array and print out each element.
        // After each row is iterated through, print a new line
        for (int k = 0; k < 19; k++) {
            for (int h = 0; h < 19; h++) {
                System.out.print(board[k][h]);
            }
            System.out.println();
        }
    }

}

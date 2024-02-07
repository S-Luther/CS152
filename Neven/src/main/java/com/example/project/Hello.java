package com.example.project;

public class Hello {

    // ◯ ●
    public static void main(String[] args) {
        // Initialize the 2d board to be 19 x 19
        String[][] board = new String[19][19];

        // Loop through the 2d board, assigning each index a string element
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (i == 0) {
                    board[i][j] = Integer.toString(j) + " ";
                } else if (j == 0) {
                    if (i <= 9) {
                        board[i][j] = Integer.toString(i) + " ";
                    }
                    else
                    {
                        board[i][j] = Integer.toString(i);
                    }

                } else {
                    board[i][j] = "|-|";
                }

            }

            // board[9][8] = "●";
            // board[9][9] = "◯";

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

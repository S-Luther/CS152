package com.example.project;

public class Hello {

    /*
     * This is looking really great, I just made it a 9x9 so it would
     * be a bit easier to read. You should go ahead and run it and see if you
     * like it otherwise you can set it be ack to 19x19 in all your loops
     * and 19x19 in the String array on line 17.
     */

    // ◯ ●
    public static void main(String[] args) {
        // Initialize the 2d board to be 19 x 19
        String[][] board = new String[9][9];
        board[4][4] = "●";
        board[3][3] = "◯";

        // Loop through the 2d board, assigning each index a string element
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    board[i][j] = Integer.toString(j) + "  ";
                } else if (j == 0) {
                    if (i <= 9) {
                        board[i][j] = Integer.toString(i) + " ";
                    } else {
                        board[i][j] = Integer.toString(i);
                    }

                } else {
                    if (board[i][j] == null) {
                        board[i][j] = "-|-";
                    }
                    else{
                        board[i][j] = "-"+board[i][j]+"-";
                    }

                }

            }

            

        }

        // This code block will loop through the 2d array and print out each element.
        // After each row is iterated through, print a new line
        for (int k = 0; k < 9; k++) {
            for (int h = 0; h < 9; h++) {
                System.out.print(board[k][h]);
            }
            System.out.println();
        }
    }

}

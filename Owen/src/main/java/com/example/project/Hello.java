package com.example.project;

public class Hello {// this class need to be named Hello, since its in the Hello.java file

    public static void main(String[] arrgs) {

        String[][] board = new String[19][19];

        // for(int i = 0; i < board.length; i++){} This is the proper syntax for a for
        // loop

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    board[i][j] = "-|";
                }

            }
        }

    }

}
//i edited

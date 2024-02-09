package com.example.project;

public class Hello {
◯ ●
    public static void main(String[] arrgs) {

        String[][] board = new String[19][19];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    board[i][j] = "-|";

                    Systemout.print(board[i][j]);
                }

            }
            System.out.println();
        }

    }

}

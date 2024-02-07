package com.example.project;

public class Hello {
    static String[][] board = new String[19][19];

    public static void main(String[] args) {
        initializeBoard();
        board[8][8] = "-●";
        board[8][10] = "-◯";
        printBoard();

    }

    static void initializeBoard() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                board[i][j] = "-|";
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (j % 19 == 0) {
                    System.out.println();
                }
                System.out.print(board[i][j]);
            }
        }
    }
}
// ◯ ●
// '-', '|' '-|'
// ◯ ●
package com.example.project;

import java.util.Scanner;
//I used B and W for Black and White peices

public class GoGame {
    private static final int BOARD_SIZE = 9;
    private char[][] board;

    public GoGame() { // function that creates the game to call it
        board = new char[BOARD_SIZE][BOARD_SIZE];
        makeBoard();
    }

    private void makeBoard() { // function that creates the board where empty ones are +
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '+';
            }
        }
    }

    private void printBoard() { // function that prints the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeStone(int row, int col, char stone) { // function that places the stone
        board[row][col] = stone;
    }

    public static void main(String[] args) throws Exception {
        GoGame game = new GoGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Go!");
        System.out.println("Enter row and column to place your stone: ");

        char currentPlayer = 'B';

        while (true) {
            game.printBoard();
            System.out.println("Player " + currentPlayer + "'s turn");

            int row = scanner.nextInt() - 1; // for 0 indexing
            int col = scanner.nextInt() - 1;

            if (row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && game.board[row][col] == '+') { // checks
                                                                                                               // if
                                                                                                               // valid
                                                                                                               // move
                game.placeStone(row, col, currentPlayer);
                currentPlayer = (currentPlayer == 'B') ? 'W' : 'B'; // changes current player
            } else {
                System.out.println("Invalid move, Try again!");
            }
        }
    }
}

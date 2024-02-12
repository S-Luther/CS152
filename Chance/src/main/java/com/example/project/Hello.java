package com.example.project;

public class Hello { // cool
    // Constant for board size
    private static final int BOARD_SIZE = 9
    // Constant for empty spaces on the board
    private static final char EMPTY = '-';
    // representation of the board with a 2d array
    private char[][] board;

    private void initializeBoard() {
        // Loop that goes through each row of the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            // Loop that goes through the column within current row
            for (int j = 0; j < BOARD_SIZE; j++) {
                // Set each cell of the board to represent an empty cell
                board[i][j] = EMPTY;
            }
        }
    }

    // Constructor that creates the board
    public GoBoard(){
        //Gives the board its column and row size
        board = new char[BOARD_SIZE] [BOARD_SIZE];
        // Calls on the function to initialize the board
        initializeBoard();

    }

    public void displayBoard() {
        // Loop through each row of the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            // Loop through each column of the board within the current row
            for (int j = 0; j < BOARD_SIZE; j++) {
                // Print the content of the current cell followed by a space
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after printing all cells of the current row
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creates an instance of the GoBoard class to make the board
        goBoard goBoard = new GoBoard();
        // Displays the go board
        goBoard.displayBoard();
    }
}

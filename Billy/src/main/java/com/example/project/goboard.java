package com.example.project;

public class GoBoard {
    public static void main(String[] args) {
        // Initialize a 19x19 2D array to represent the Go board
        String[][] goBoard = new String[19][19];
        
        // Initialize the board with spaces and print it
        initializeBoard(goBoard);
        printBoard(goBoard);
        
        // Example: setting pieces based on fixed positions
        // For dynamic user input, consider using Scanner (java.util.Scanner)
        goBoard[9][9] = "◯"; // White piece
        goBoard[9][8] = "●"; // Black piece
        
        // Re-print the board after setting the pieces
        System.out.println("After placing two pieces:");
        printBoard(goBoard);
    }
    
    private static void initializeBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "_"; // Use underscore for empty spaces
            }
        }
    }
    
    private static void printBoard(String[][] board) {
        // Print column coordinates
        System.out.print(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(" " + (i + 1) % 10); // Print column numbers, reset every 10
        }
        System.out.println();
        
        for (int i = 0; i < board.length; i++) {
            // Print row coordinate
            System.out.print((i + 1) % 10); // Print row numbers, reset every 10
            
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j]); // Use vertical bar to separate spaces
            }
            System.out.println("|");
        }
    }
}

//looking pretty good but the styling is not good
//I might recommend some tabbing
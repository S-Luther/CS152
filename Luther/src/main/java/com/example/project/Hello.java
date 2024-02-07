package com.example.project;

import java.util.Scanner;

//go pieces ◯ ●

public class Hello {

    static String[][] Board = {
            { "♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖" },
            { "♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙", },
            { "", "", "", "", "", "", "", "", },
            { "", "", "", "", "", "", "", "", },
            { "", "", "", "", "", "", "", "", },
            { "", "", "", "", "", "", "", "", },
            { "♟︎", "♟︎", "♟︎", "♟︎", "♟︎", "♟︎", "♟︎", "♟︎", },
            { "♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜" }
    };
    // 8x8 2d array with pieces in place for chess.

    static String[][] goBoard = new String[9][9];
    // small goBoard ^^

    // Structures to compare to later. These will help us tell if a piece is white
    // or black.
    static String[] white = { "♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖", "♙" };
    static String[] black = { "♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜", "♟︎" };
    // We'll be able to do this by essentially asking if e.g. black[] contains("some
    // piece")

    public static void main(String[] args) {

        Boolean cont = true;
        // The condition on which our game loop hangs

        int moveX, moveY;
        // Placeholders for the coordinates from the user

        String choice;

        Scanner scn = new Scanner(System.in);
        // Scanner object for getting user input, parsing it

        while (cont) {

            Boolean flipper = true;
            // flipped back and forth to create checkerboard pattern

            System.out.println("   0  1  2  3  4  5  6  7");
            // A loop that will print out all rows
            for (int i = 0; i < Board.length; i++) {
                // A loop that will handle each column a member at a time.
                // inner loop will run for the length of the board for each outer loop.

                System.out.print(i + " ");

                for (int j = 0; j < Board[i].length; j++) {

                    flipper = !flipper;
                    // flippiing the flipper per column

                    if (Board[i][j] == "") {
                        // printing out an empty space,
                        // either black or white based on flipper
                        if (flipper) {
                            System.out.print("   ");
                        } else {
                            System.out.print("███");
                        }
                    }

                    else {
                        // printing out a space with a piece,
                        // black or white flanks based on flipper
                        if (flipper) {
                            System.out.print(" " + Board[i][j] + " ");
                        } else {
                            System.out.print("█" + Board[i][j] + "█");
                        }
                    }
                }
                System.out.println();
                // Going to a newline after a row is completed.

                flipper = !flipper;
                // flippiing the flipper again so we have checkers instead of lines.
                // flipping it per row.
            }

            System.out.println();
            System.out.println();
            // Just making space

            // The main game loop
            // This loop will repeat until cont = false

            System.out.print("Please enter the X coordinate of a piece: ");
            moveX = scn.nextInt();
            // Asking the user for an x coord and assigning it to moveX

            System.out.println();

            System.out.print("Please enter the Y coordinate of a piece: ");
            moveY = scn.nextInt();
            // Asking the user for an y coord and assigning it to moveY

            System.out.println();

            switch (Board[moveY][moveX]) {
                // switching on the piece at the coords on the Board

                // TODO: add cases for each piece
                case "♘":
                case "♞":
                    System.out.println("You can move to: ");
                    System.out.print("a(" + (moveX + 2) + "," + (moveY + 1) + "), ");
                    System.out.print("b(" + (moveX + 2) + "," + (moveY - 1) + "), ");
                    System.out.print("c(" + (moveX - 2) + "," + (moveY + 1) + "), ");
                    System.out.print("d(" + (moveX - 2) + "," + (moveY - 1) + "), ");
                    System.out.print("e(" + (moveX + 1) + "," + (moveY + 2) + "), ");
                    System.out.print("f(" + (moveX + 1) + "," + (moveY - 2) + "), ");
                    System.out.print("g(" + (moveX - 1) + "," + (moveY + 2) + "), ");
                    System.out.print("h(" + (moveX - 1) + "," + (moveY - 2) + ") ");
                    System.out.println("Please select a move: ");

                    choice = scn.next();

                    switch (choice) {
                        case "a":
                        case "A":
                            Board[moveY + 1][moveX + 2] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "b":
                            Board[moveY - 1][moveX + 2] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "c":
                            Board[moveY + 1][moveX + 2] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "d":
                            Board[moveY - 1][moveX - 2] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "e":
                            Board[moveY + 2][moveX + 1] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "f":
                            Board[moveY - 2][moveX + 1] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "g":
                            Board[moveY + 2][moveX - 1] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                        case "h":
                            Board[moveY - 2][moveX - 1] = Board[moveY][moveX];
                            Board[moveY][moveX] = "";
                            break;
                    }

                    break;

                default:
                    System.out.println("The piece: " + Board[moveY][moveX]);
                    // Just checking what is returned by coords for testing
            }
        }
    }

}

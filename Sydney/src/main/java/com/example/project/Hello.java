package com.example.project;

import java.util.Scanner;

public class Hello {
    // go pieces ◯ ●
    static String[][] goBoard = new String[9][9];
    static Scanner scn = new Scanner(System.in);
    // keep track of what pieces are white or black
    static String white = "◯";
    static String black = "●";

    public static void main(String[] args) {
        goBoard[3][3] = white;
        goBoard[3][2] = black;
        Boolean flipper = false;
        String curTurn = black;
        Boolean quit = false;
        while (quit == false){
            System.out.println("  1  2  3  4  5  6  7  8  9");
            for (int i = 0; i < goBoard[0].length; i++) {
                System.out.print(i + 1);
                System.out.print("|");
                for (int j = 0; j < goBoard[i].length; j++) {
                    if (goBoard[i][j] == null) {
                        System.out.print("—|");

                    } else {
                        System.out.print("—" + goBoard[i][j]);
                    }

                    // The else statement should be used to print the pieces

                }
                // Will make a new row at the end of each j itteration
                System.out.println();
            }
            // cases can be stacked, don't put a switch staement into another switch
            // statement
            // can't have logical operators in cases, won't run expressions within the cases
            // themselves
            System.out.println("Enter x coordinate for your piece:");
            int coorX = scn.nextInt();
            System.out.println("Enter y coordinate for your piece:");
            int coorY = scn.nextInt();
            if (coorY > goBoard[1].length|| coorX >goBoard[1][1].length){
                System.out.println("Out of bounds")
                continue;
            }
            if (goBoard[coorY][coorX] == null) 
            {
                if (flipper == true){
                    curTurn  = white;
                }
                else
                {
                    curTurn = black;
                }
                goBoard[coorY][coorX] = "-" + curTurn + "-";
            }else{
                System.out.println("Placement unavailable, space is not empty");
                continue;
            }
            // can quit here
            System.out.println("Continue to next turn? (y/n)");
            String ans = scn.next();
            if (ans != "n"){
                quit = true;
            }
            // changes to opponents turn
            flipper = !flipper;

        }
        scn.close();
        // need to close stream
    }
}
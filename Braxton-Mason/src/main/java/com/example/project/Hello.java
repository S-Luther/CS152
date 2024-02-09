package com.example.project;

import java.util.Scanner;
//go pieces ◯ ●

public class Hello {

    /*
     * static String[][] Board = {
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|◯|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|●|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",},
     * {"|-|","|-|","|-|","|-|","|-|","|-|","|-|","|-|",}
     * };
     */

    static String[][] Board = new String[9][9];

    public static void main(String[] args) {
        // Board[5][4] = "◯";
        // Board[4][5] = "●";

        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                Board[i][j] = "-|";
                Board[5][4] = "◯|";
                Board[4][5] = "●|";
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }

        Boolean cont = true;
        Boolean flipper = true;
        int moveX, moveY;
        Scanner scn = new Scanner(System.in);

        while (cont) {
            if (flipper == true) {
                System.out.println("It is White's turn");
                System.out.print("Give me a number for the x coord for a new white peice");
                moveX = scn.nextInt();
                System.out.print("Give me a number for the y coord for a new white peice");
                moveY = scn.nextInt();
                Board[moveX][moveY] = "●|";
                // need to print board with new peices
                flipper = !flipper;
            } else {
                System.out.println("It is Blacks's turn");
                System.out.print("Give me a number for the x coord for a new Black peice");
                moveX = scn.nextInt();
                System.out.print("Give me a number for the y coord for a new Black peice");
                moveY = scn.nextInt();
                Board[moveX][moveY] = "●|";
                // need to print board with new peices
                flipper = !flipper;
            }
        }

    }
}

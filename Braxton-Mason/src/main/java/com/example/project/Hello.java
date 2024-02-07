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
        int moveX, moveY;
        Scanner scn = new Scanner(System.in);

        /*
         * while (cont) {
         * System.out.println("All coords need to be within 9x9");
         * 
         * System.out.print("Please Enter X-vlaue for a new Go peice");
         * moveX = scn.nextInt();
         * 
         * System.out.print("Please Enter y-value for a new Go peice");
         * moveY = scn.nextInt();
         * 
         * }
         */

    }
}

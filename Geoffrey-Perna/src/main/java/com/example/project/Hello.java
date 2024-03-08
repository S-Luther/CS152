package com.example.project;

//go pieces ◯ ●
import java.util.Scanner;
import java.util.random;

public class hello {
    static int boardSize = 19;
    static String[][] hello = new String[boardSize][boardSize];

        public static void main(String[] args) {
        Boolean cont = true, turn = true;
        // The condition on which our game loop hangs
        int moveX, moveY;
        // Placeholders for the coordinates from the user
        String white = "●", black = "◯";

        Scanner userMove = new Scanner(System.in);
        // Scanner object for getting user input, parsing it
        while (cont == true){

            //System.out.println("\n" + ((turn) ? "Black":"White")) + "'s turn to move!\n\n";
            if (turn == true){
                System.out.println("Player 1, Please enter the X coordinate of your move.");
                moveX = userMove.nextInt();
                System.out.println("Now enter the Y coordinate of your move.");
                moveY = userMove.nextInt();
                System.out.println("Thank you.");
            //Asks player 1 for x and y coordinates of move
            }
            else {System.out.println("Player 2, Please enter the X coordinate of your move.");
            moveX = userMove.nextInt();
            System.out.println("Now enter the Y coordinate of your move.");
            moveY = userMove.nextInt();
            System.out.println("Thank you.");}
            
            //System.out.println("\n" + (turn) ? "Black":"White") + "'s turn to move!\n\n";

            if (hello[moveX][moveY] == null && turn == true) {hello[moveX][moveY] = black;}
            else if (hello[moveX][moveY] == null && turn == false) {hello[moveX][moveY] = white;}
            else {System.out.println("Invalid move. Please choose again.");
                continue;}

            for (int i = 0; i < hello.length; i++) {

                for(int j = 0; j <hello.length; j++) {

                    if (hello[i][j] == null) {
                        System.out.print("+");
                    }
                    else{  System.out.print(hello[i][j]);}

                    if(j < hello.length -1);
                        System.out.print(" ");
                }
                
                System.out.println();
                turn = !turn;
        }
    }
    };

}

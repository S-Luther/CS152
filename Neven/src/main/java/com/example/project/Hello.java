package com.example.project;
import java.util.Scanner;

public class Hello {

    /*
     * This is looking really great, I just made it a 9x9 so it would 
     * be a bit easier to read. You should go ahead and run it and see if you
     * like it otherwise you can set it be ack to 19x19 in all your loops
     * and 19x19 in the String array on line 17.
     */

     static void printBoard(String [][]array)
        {
            
            System.out.println("  0 1 2 3 4 5 6 7 8");   //Print out the x coordinates above the board
            for(int i = 0; i < array[0].length; i ++)
            {
                System.out.print(i + " ");      //Print out the y coordinate on the left side of the board
                for(int j = 0; j < array.length; j++)
                {
                    if(array[i][j] == null) //if the current spot on the board doesn't have a piece on it...
                    {
                        if(j == 0)  //Check if it's the first column, if it is, print | as the edge of the board
                        {
                            System.out.print("|");

                        }
                        else
                        {
                            System.out.print("-|"); //Otherwise, print -|
                        }
                    }
                    else    //Print the peice at [i][j]
                    {
                        if(i == 0)
                        {
                            System.out.print(array[i][j]);
                        }
                        else
                        {
                            System.out.print("-"+array[i][j]);
                        }
                        
                    }
                }
                System.out.println();
        }
        }


    // ◯ ●
    public static void main(String[] args) {
        // Initialize the 2d board to be 19 x 19
        String[][] board = new String[9][9];
        printBoard(board);
        //board[4][4] = "●";
        //board[3][3] = "◯";


        Scanner obj = new Scanner(System.in);
        boolean blackTurn = true;
        int[][] placedStones = new int[9][9];
        while(true)
        {
            //Prompt the user to enter coordinates for whoever's turn it is
            System.out.println((blackTurn)?"Black's turn":"White's turn");
            System.out.println("Please enter a x coordinate for your stone");
            int x = obj.nextInt();
            System.out.println("Please enter a y coordinate (0-8)");
            int y = obj.nextInt();
            //Check to see if that spot is a valid position - create a function that loops through placedStones and checks
            board[x][y] = (blackTurn)?"●":"◯";
            printBoard(board);
            blackTurn = !blackTurn; //Flip the turn


        }
        
        


    }
}
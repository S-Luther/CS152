package com.example.project;

import java.util.Scanner;

public class goBoard {
    // ⚫⚪

    static String[][] board = new String[19][19];
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == null){
                    if(j == 0){
                        System.out.print("|");
                    }
                    else{
                        System.out.print("-|");
                    }
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("Enter an X coordinate: ");
        int mX = s.nextInt();
        System.out.println("Enter a Y coordinate: ");
        int mY = s.nextInt();

        if(board[mX][mY] != null){
            System.out.println("Sorry, that space is occupied!");
        }
        else if((mX > board.length) || (mY > board[].length)){
            System.out.println("You missed the board!");
        }
        else{
            board[mX][mY] = ◯;
            System.out.println("Tile placed");
        }
    }

}

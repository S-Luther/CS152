package com.example.project;

public class Go {

    public static void main(String[] args){
        String[][] board = new String[9][9];

        System.out.println("  0 1 2 3 4 5 6 7 8");

        for (int i = 0; i < board[0].length; i++){
            System.out.print(i+" ");
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == null){
                    if (j == 0){
                        System.out.print("+ ");
                    }
                    else{
                        System.out.print("+ ");
                    }
                }else{
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
}
//go pieces ◯ ●
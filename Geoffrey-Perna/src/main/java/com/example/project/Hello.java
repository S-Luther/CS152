package com.example.project;

//go pieces ◯ ●

public class Hello {
    static String[][] goBoard = new String[19][19];

    public static void main(String[] args) {

        goBoard[9][9] = "◯";
        goBoard[9][8] = "●";
        for (int i = 0; i < goBoard.length; i++) {

            for(int j = 0; i <goBoard.length; j++) {

                goBoard[i][j] = "+"
                System.out.print(goBoard[i][j])

                if(j < goBoard.Length -1);
                    System.out.print(" ")
            }

        }
    };

}
// Main methods need to be in the Hello class

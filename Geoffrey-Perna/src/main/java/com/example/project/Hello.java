package com.example.project;

//go pieces ◯ ●

public class Hello {
    static String[][] goBoard = new String[19][19];

    public static void main(String[] args) {

        goBoard[9][9] = "◯";
        goBoard[9][8] = "●";
        for (int i = 0; i < goBoard.length; i++) {

            for(int j = 0; j <goBoard.length; j++) {
                //This isn't printing out the go pieces because you
                //are overwriting them all on line 17.
                if goBoard[i][j] == null; {
                    System.out.print("+")
                }
                //You may want to do a check if the position is null and print out
                //"+" instead of assigning "+"
                System.out.print(goBoard[i][j]);

                if(j < goBoard.length -1);
                    System.out.print(" ");
            }
            
            System.out.println();
        }
    };

}

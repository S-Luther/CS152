package com.example.project;

public class Hello {

    public static void main(String[] args) {
        String[][] goBoard = new String[19][19];

        goBoard[9][8] = "●";
        goBoard[9][7] = "◯";

    System.out.println(x:" 0 1 2 3 4 5 6 7 8")
    for (int j = 0; j <goBoard.length; j++) {
        System.out.print(i+" ");
        for (int j = 0; j <goBoard.length; j++) {
            if (goBoard[i][j] == null) {
                if(j == 0){
                    System.out.print(s:"|");
                }
                else{
                    System.out.print(s:"-|");
                }
            } else {
                System.out.print(goBoard[i][j]);
            }
        }
    } 
    System.out.println();
    }
}


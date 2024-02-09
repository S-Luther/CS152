package com.example.project;

public class Hello {

    static String[][] goBoard = new String[19][19];

    public static void main(String[] args) {
        System.out.println(" 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17");
        goBoard[10][12]= "●";
        goBoard[11][3] = "◯";
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18; j++) {
                if (goBoard[i][j] == null) {
                    goBoard[i][j] = "-|-";
                } else {
                    goBoard[i][j] = "-" + goBoard[i][j] + "-";
                }
                System.out.print(goBoard[i][j]);
            }
            System.out.println();
        }
    }
}

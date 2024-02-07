package com.example.project;

public class Hello {

    static String[][] goBoard = new String[19][19];

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = "_|";
                goBoard[i][18] = "_";
                System.out.print(goBoard[i][j]);
            }
        System.out.println();
        }
    }
}

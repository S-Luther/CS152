package com.example.project;

public class Hello {

    public static void main(String[] args) {

        String[][] Board = new String[38][38];

        boolean flipper = true;

        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (flipper) {
                    Board[i][j] = "-";
                }
            }
        }

    }

}

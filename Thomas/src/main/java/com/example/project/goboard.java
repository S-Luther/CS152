package com.example.project;

//go pieces ◯ ●

public class goboard {

    static String[][] Board = new String[19][19];

    static void create_board() {
        for (int i = 0; i <= 18; i++) {
            for (int j = 0; j <= 18; j++) {
                Board[i][j] = "-|";

            }
        }
        
    }

    public static void main(String[] args) {
        create_board();
    }

}

// T put was here

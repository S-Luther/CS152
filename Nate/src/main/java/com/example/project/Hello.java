package com.example.project;

public class Hello {

    // question, for arrays, if it starts its count at 0 will the size be
    // written[18][18]?
    // Sizes will be normal but addresses will be size - 1
    // It's an odd system, but technically your board should be 19x19

    public static void main(String[] args) {
        // If it's inside a function like main it doesn't need to be static
        String[][] Board = new String[18][18];
        // go pieces ◯ ●
        Board[9][9] = "◯";
        Board[9][8] = "●";

        System.out.println(" 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18");

        for (int i = 0; i < Board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(j + " ");

            }

        }
    }

}

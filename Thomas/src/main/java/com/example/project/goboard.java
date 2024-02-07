package com.example.project;

//go pieces ◯ ●

public class goboard {

    static String[][] Board = {
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "●", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
            { "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|",
                    "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|", "-", "|" },
    };

    //oh  my

    public static void main(String[] args) {

        Boolean flipper = true;

        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                flipper = !flipper;
                if (Board[i][j] == "") {
                    if (flipper) {
                        System.out.print("   ");
                    } else {
                        System.out.print("███");
                    }
                } else {
                    if (flipper) {
                        System.out.print("" + Board[i][j] + "");
                    } else {
                        System.out.print("" + Board[i][j] + "");
                    }
                }
            }
            System.out.println();
            flipper = !flipper;
        }

        System.out.println();
        System.out.println();
    }

}


// T put was here

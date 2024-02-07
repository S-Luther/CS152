package com.example.project;

public class Hello {

    public static void main(String[] args) {
        // if it's inside a function, like main, it doesn't need to be static

        // add cords adjust later
        String[] xCords = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
        String[] yCords = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        // add pattern for board (-| or other)
        String[][] goboard = {
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
                { "", "", "", "", "", "", "", "", "" },
        };

        // replace with piece
        goBoard[3][3] = "◯";
        goBoard[3][2] = "●";

        // ask user for cords

        // check if cords are valid

        // check if cords are empty

        // place piece

        // This is looking great!

    };
}

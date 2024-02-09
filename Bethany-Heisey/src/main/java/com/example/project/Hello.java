package com.example.project;

public class Hello {

        static String[][] goBoard = new String[19][19];
        // ^^ You Might want to do something like this ^^

        // \/\/ Also, you need a main method \/\/
        public static void main(String[] args) {
                for (int i = 0; i <= 19; i++) {
                        for (int j = 0; j <= 19; j++) {
                                System.out.print("-|");
                        }
                        System.out.println();
                }
        }
}
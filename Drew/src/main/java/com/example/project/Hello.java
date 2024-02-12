package com.example.project;

import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter desired board width: ");
        int width = scn.nextInt();

        System.out.print("Enter desired board length: ");
        int length = scn.nextInt();
        
        System.out.println();

        String Board[][] = new String[length][width];

        // need to print coords for columns w/ for loop here

        System.out.print("  0")

        for (int i = 0; i < Board.length; i++ ){
            System.out.print(i + " ");
            for (int j = 0; j < Board[0].length; j++ ){
                if (Board[i][j] == null){
                    if (j == 0){
                        System.out.print("|");
                    } else {
                        System.out.print("-|");
                    }
                } else {
                    System.out.print(Board[i][j]);
                }
            }
            System.out.println();
        }

        Boolean cont = true;

        while(cont){

        }

        scn.close();
    }
}

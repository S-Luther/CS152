package com.example.project;

public class Hello {
    // static String[][] goBoard = {
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    //     {"|", "-|", "-|", "-|", "-|", "-|", "-|", "-|", "-|"}
    // };
    public static void main(String[] args) {
        //This was missing the "new String" part of "new String[10][10]"
        String[][] goBoard = new String[10][10];
        
        for(int i = 0; i < goBoard.length; i++) {
            for(int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = "-|";
                //You are never printing, 
                //you may want to print out System.out.print(goBoard[i][j]);
            }
            //Then you will want to print a new line with System.out.println();
            //to make sure the output isn't just one long line.
        }
    }
}

// go pieces ◯ ●



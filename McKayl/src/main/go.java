/******************************************************************************
 * \
 * Basic attempt at a go game
 * McKayl U.
 * \
 ******************************************************************************/

public class go {

    private static final Boolean TRUE = true;
    static String[][] goBoard = new String[19][19]; // I want to change this to be a variable size //

    public static void main(String[] args) {
        // Initialize //
        initializeGoBoard();

        // Print da board //
        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                System.out.print(goBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initializeGoBoard() {
        // Initialize? Maybe this should be a while loop? //
        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = ".";
            }
        }
    }
}
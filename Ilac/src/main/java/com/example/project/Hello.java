
// import for input
import java.util.Scanner;

public class GoBoard {

    // Main method
    public static void main(String[] args) {
        // initialize size and board
        int size = 9;
        char[][] board = new char[size][size];

        // Initialize the board with empty spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }

        // Print the initial board
        // printBoard(board);

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // get user row
        System.out.print("Enter the row coordinate (1-9): ");
        int row = scanner.nextInt() - 1;

        // get user col
        System.out.print("Enter the column coordinate (1-9): ");
        int col = scanner.nextInt() - 1;

        // Check if the coordinate is empty
        if (isValidMove(board, row, col)) {
            // Place 'X' at the chosen coordinate
            board[row][col] = 'X';

            // Print updated board
            printBoard(board);
        } else {
            System.out.println("Invalid move. The chosen coordinate is not empty.");
        }

        // close scanner. Uncomment if needed
        // scanner.close();
    }

    // Method to print the board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to check if cord is empty
    private static boolean isValidMove(char[][] board, int row, int col) {
        return board[row][col] == '.';
    }
}

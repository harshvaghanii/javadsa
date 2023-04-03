package Backtracking;

public class CountWaysNQueens {
    public static int count = 0;

    public static void countWays(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                countWays(board, row + 1);
                board[row][j] = '.';
            }
        }

    }

    public static boolean isSafe(char[][] board, int row, int col) {

        // Top

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Diagonal Left

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Diagonal Right

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        countWays(board, 0);
        System.out.println("The total number of ways are : " + count);
    }

}

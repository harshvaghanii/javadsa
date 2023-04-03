package Backtracking;

public class PrintSolutionNQueens {
    public static boolean nQueens(char[][] board, int row) {
        if (row == board.length) {
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                boolean solution = nQueens(board, row + 1);
                if (solution) {
                    return true;
                }
                board[row][j] = 'X';
            }
        }

        return false;

    }

    public static void print(char[][] board) {
        System.out.println("-----------Board---------------");
        for (char[] arr : board) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        // Top

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Diagonal Right Up

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Diagonal Left Up

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueens(board, 0))
            print(board);
        else
            System.out.println("No solution exists!");
    }

}

package Backtracking;

public class SudokuSolver {

    public static boolean sudokuSolver(int[][] board, int row, int col) {
        if (row >= board.length) {
            printBoard(board);
            return true;
        }

        int newRow = row, newCol = col + 1;
        if (newCol >= board.length) {
            newRow++;
            newCol = 0;
        }

        // Checking if a number already exists on that cell

        if (board[row][col] != 0)
            return sudokuSolver(board, newRow, newCol);

        for (int i = 1; i <= 9; i++) {
            if (isValid(board, row, col, i)) {
                board[row][col] = i;
                if (sudokuSolver(board, newRow, newCol))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {

        // Searching for the number in row

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num)
                return false;
        }

        // Searching for the number in Column

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num)
                return false;
        }

        // Searching for the number in Grid

        int start_row = (row / 3) * 3;
        int start_col = (col / 3) * 3;

        for (int i = start_row; i < start_row + 3; i++) {
            for (int j = start_col; j < start_col + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int[] a : board) {
            for (int i : a)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] board = {
        // { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
        // { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
        // { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        // { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
        // { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
        // { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        // { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        // { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        // { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        // };

        // int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        // { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        // { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        // { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        // { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        // { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        // { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        // { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        // { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        boolean res = sudokuSolver(board, 0, 0);
        System.out.println(res);
    }

}
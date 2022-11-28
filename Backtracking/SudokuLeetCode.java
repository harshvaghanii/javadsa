package Backtracking;

public class SudokuLeetCode {
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }

    public boolean sudokuSolver(char[][] board, int row, int col) {
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

        if (board[row][col] != '.')
            return sudokuSolver(board, newRow, newCol);

        for (int i = 1; i <= 9; i++) {
            char c = (char) (i + '0');
            if (isValid(board, row, col, c)) {
                board[row][col] = c;
                if (sudokuSolver(board, newRow, newCol))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isValid(char[][] board, int row, int col, char num) {

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

    public static void printBoard(char[][] board) {
        for (char[] a : board) {
            for (char i : a)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SudokuLeetCode obj = new SudokuLeetCode();
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        obj.solveSudoku(board);
    }
}

package Backtracking;

public class HurdleTraining {

    public static void burnCalories(char[][] board, int target) {
        int res = grid(board, 0, 0, 0);
        if (res > target) {
            System.out.println("Yes " + (res - target));
        } else if (res == target) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int grid(char[][] board, int i, int j, int cal) {

        if (i == board.length - 1 && j == board[0].length - 1)
            return 5 + cal;
        if (i == board.length || j == board[0].length)
            return 0;

        if (board[i][j] == '.') {
            if (i != 0 || j != 0)
                cal += 5;
            int down = grid(board, i + 1, j, cal);
            int right = grid(board, i, j + 1, cal);
            return Math.max(down, right);
        }
        cal -= 5;
        return cal;
    }

    public static void main(String[] args) {
        // char[][] board = { { '.', '.', '#', '#' }, { '#', '.', '#', '#' }, { '#',
        // '.', '.', '.' } };
        char[][] board = { { '.', '.', '.', '#', '#' }, { '.', '#', '.', '.', '#' },
                { '.', '#', '#', '.', '#' },
                { '.', '.', '#', '.', '.' } };
        burnCalories(board, 30);
    }

}

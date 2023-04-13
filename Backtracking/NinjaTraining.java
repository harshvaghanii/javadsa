package Backtracking;

public class NinjaTraining {

    public static void ninja(char[][] grid, int target) {
        int row = 0, col = 0;
        int calories = util(grid, row, col);
        if (calories >= target) {
            System.out.println("Yes");
            if (calories != target) {
                System.out.println(calories - target);
            }
        } else {
            System.out.println("No");
        }
    }

    public static int util(char[][] grid, int row, int col) {
        if (row >= grid.length || col >= grid[0].length) {
            return 0;
        }
        if (grid[row][col] == '.') {
            if (row != 0 || col != 0) {
                int right = 5 + util(grid, row, col + 1);
                int bottom = 5 + util(grid, row + 1, col);
                return Math.max(right, bottom);
            } else {
                return Math.max(util(grid, row, col + 1), util(grid, row + 1, col));
            }
        }
        return -5;
    }

    public static void main(String[] args) {
        // char[][] grid = { { '.', '.', '#', '#' }, { '#', '.', '#', '#' }, { '#', '.',
        // '.', '.' } };
        // char[][] grid = { { '.', '.', '.', '#', '#' }, { '.', '#', '.', '.', '#' }, {
        // '.', '#', '#', '.', '#' },
        // { '.', '.', '#', '.', '.' } };
        char[][] grid = { { '.', '.', '.', '#', '#' }, { '.', '#', '.', '.', '#' }, { '.', '#', '#', '.', '#' },
                { '.', '.', '#', '.', '.' } };
        ninja(grid, 35);
    }
}

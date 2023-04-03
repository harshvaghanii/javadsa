package Backtracking;

public class GridWays {
    public static int gridWays(int[][] grid, int row, int col) {

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        } else {
            if (row == grid.length || col == grid.length)
                return 0;
        }

        int numberOfDownWays = gridWays(grid, row + 1, col);
        int numberOfUpWays = gridWays(grid, row, col + 1);

        return numberOfDownWays + numberOfUpWays;

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] grid = new int[m][n];
        int ways = gridWays(grid, 0, 0);
        System.out.println("The number of ways are : " + ways);
    }
}

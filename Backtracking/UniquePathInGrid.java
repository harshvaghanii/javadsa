package Backtracking;

public class UniquePathInGrid {

    public static int uniquePath(int[][] grid, int i, int j) {

        if (i == grid.length - 1 && j == grid[0].length)
            return 1;
        if (i == grid.length || j == grid[0].length)
            return 0;
        if (grid[i][j] == 1)
            return 0;

        int downPath = uniquePath(grid, i + 1, j);
        int rightPath = uniquePath(grid, i, j + 1);

        return downPath + rightPath;

    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int res = uniquePath(grid, 0, 0);
        System.out.println("The result is : " + res);
    }

}

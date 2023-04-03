package Backtracking;

/*
 * This is a linear time calculation for calculating the number of grid ways.
 * The concept of permutations is used here.
 * The Idea is we have two characters, D and R.
 * The way from top left to bottom right would have n-1 + m-1 D and R.
 * Hence, to arrange them, we use the permutations formula.
 */
public class GridWaysTrick {

    public static int gridWays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return factorial((m - 1 + n - 1)) / ((factorial(m - 1)) * (factorial(n - 1)));

    }

    public static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] grid = new int[m][n];
        int ways = gridWays(grid);
        System.out.println("The number of ways are : " + ways);
    }
}

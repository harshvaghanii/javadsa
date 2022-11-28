package Backtracking;

public class GridWays {

    public static int gridWays(int[][] mat, int i, int j) {
        if (i == mat.length - 1 || j == mat[0].length - 1) {
            return 1;
        }
        return gridWays(mat, i + 1, j) + gridWays(mat, i, j + 1);
    }

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int res = gridWays(mat, 0, 0);
        System.out.println("The result is : " + res);
    }
}

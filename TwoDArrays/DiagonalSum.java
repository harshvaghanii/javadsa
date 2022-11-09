package TwoDArrays;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = 0; i < mat.length && j < mat[0].length; i++, j++) {
            sum += mat[i][j];
        }

        for (int i = 0, j = mat[0].length - 1; i < mat.length && j >= 0; i++, j--) {
            sum += mat[i][j];
        }
        if (mat.length % 2 != 0) {
            int key = mat.length / 2;
            sum -= mat[key][key];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int diagSum = diagonalSum(a);
        System.out.println(diagSum);
    }
}

package Arrays.Matrix.Searching;

public class SearchInSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target)
                return true;
            if (matrix[row][column] < target)
                row++;
            else
                column--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 11;
        if (searchMatrix(matrix, target)) {
            System.out.println("The given target exists in the matrix!");
        } else {
            System.out.println("The given target does not exist in the matrix!");
        }
    }
}
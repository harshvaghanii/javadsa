package TwoDArrays;

public class SpiralMatrix {
    public static void spiralPrint(int matrix[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Top
            for (int i = startColumn; i <= endColumn; i++)
                System.out.print(matrix[startRow][i] + " ");

            // Right
            for (int i = startRow + 1; i <= endRow; i++)
                System.out.print(matrix[i][endColumn] + " ");

            // Bottom
            for (int i = endColumn - 1; i >= startColumn; i--)
                System.out.print(matrix[endRow][i] + " ");

            // Left
            for (int i = endRow - 1; i > startRow; i--)
                System.out.print(matrix[i][startColumn] + " ");

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiralPrint(a);
    }
}

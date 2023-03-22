package Arrays.Matrix.General;

public class SpiralMatrix {
    public static void printSpiral(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;

        // Initiating the while loop

        while (startRow <= endRow && startCol <= endCol) {

            // Printing the top row

            for (int j = startRow; j <= endCol; j++) {
                System.out.print(mat[startRow][j] + " ");
            }

            // Printing the right Column

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + " ");
            }

            // Printing the bottom row

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow)
                    break;
                System.out.print(mat[endRow][j] + " ");
            }

            // Printing the left column

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol)
                    break;
                System.out.print(mat[i][startCol] + " ");
            }

            // Loop iteration conditions

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
                15, 16 } };
        // int[][] mat = { { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 },
        // };
        // int[][] mat = { { 1 }, { 2 }, { 3 }, { 4 } };
        // int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printSpiral(mat);
    }

}

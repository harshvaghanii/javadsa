package Arrays.Matrix.General;

import java.util.*;

public class Matrix {

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int[][] mat, int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == key) {
                    System.out.println("The key is found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void fillMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] mat = new int[3][3];
        // fillMatrix(mat, sc);
        sc.close();
        printMatrix(mat);
        search(mat, 60);
    }
}

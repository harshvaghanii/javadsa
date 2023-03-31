package Backtracking;

/*
 * Question : 
 * Given a size n of an Array, fill the array with index + 1 value recursively.
 * While backtracking, decrease each values by 2.
 */

public class FillArrays {

    public static void fill(int[] arr, int size, int index) {
        if (index == size) {
            return;
        }
        arr[index] = index + 1;
        fill(arr, size, index + 1);
        arr[index] = arr[index] - 2;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        fill(arr, arr.length, 0);
        print(arr);
    }

}

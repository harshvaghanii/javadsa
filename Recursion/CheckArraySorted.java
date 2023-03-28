package Recursion;

public class CheckArraySorted {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;
        if (arr[i] <= arr[i + 1])
            return isSorted(arr, i + 1);
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 30, 4, 5 };
        boolean isSorted = isSorted(arr, 0);
        if (isSorted) {
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array is not sorted!");
        }
    }

}

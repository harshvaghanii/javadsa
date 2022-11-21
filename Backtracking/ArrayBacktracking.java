package Backtracking;

public class ArrayBacktracking {

    public static void fillArray(int[] arr, int index) {

        if (index == arr.length)
            return;

        arr[index] = index + 1;
        fillArray(arr, index + 1);
        arr[index] = arr[index] - 2;
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(arr, 0);
        print(arr);
    }
}

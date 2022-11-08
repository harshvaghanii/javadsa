package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 24, 12, 35, 34, 21, 25, 12, 15, 25 };
        System.out.println("Printing the unsorted array : ");
        print(arr);
        bubbleSort(arr);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }
}

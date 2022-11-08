package Sorting;

public class InsertionSort {

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
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
        insertionSort(arr);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }
}

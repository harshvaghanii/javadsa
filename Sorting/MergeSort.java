package Sorting;

public class MergeSort {

    public static void mergeSort(int[] a, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void merge(int[] a, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];
        for (int i = 0; i < left.length; i++) {
            left[i] = a[l + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = a[i + m + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
            k++;
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }

        while (j < right.length) {
            a[k++] = right[j++];
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
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }
}

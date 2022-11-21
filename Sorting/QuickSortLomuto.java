package Sorting;

public class QuickSortLomuto {

    public static void qSortLomuto(int[] a, int l, int h) {
        if (l < h) {
            int pivot = lomutoPartition(a, l, h);
            qSortLomuto(a, l, pivot - 1);
            qSortLomuto(a, pivot + 1, h);
        }
    }

    public static int lomutoPartition(int[] a, int l, int h) {
        int pivot = a[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = pivot;
        a[h] = temp;
        return i + 1;
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
        qSortLomuto(arr, 0, arr.length - 1);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }
}

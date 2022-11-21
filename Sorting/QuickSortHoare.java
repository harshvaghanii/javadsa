package Sorting;

public class QuickSortHoare {

    public static void qSortHoare(int[] a, int l, int h) {
        if (l < h) {
            int pivot = hoarePartition(a, l, h);
            qSortHoare(a, l, pivot);
            qSortHoare(a, pivot + 1, h);
        }
    }

    public static int hoarePartition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l - 1;
        int j = h + 1;

        while (true) {

            do {
                i++;
            } while (a[i] < pivot);

            do {
                j--;
            } while (a[j] > pivot);
            if (i >= j)
                return j;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
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
        qSortHoare(arr, 0, arr.length - 1);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }

}

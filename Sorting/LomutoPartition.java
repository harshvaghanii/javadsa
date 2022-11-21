package Sorting;

public class LomutoPartition {
    public static void lomutoPartition(int[] a) {
        int n = a.length;
        int pivot = a[n - 1];
        int i = -1;
        for (int j = 0; j < n - 1; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = pivot;
        a[n - 1] = temp;
    }

    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 12, 15, 78, 4, 31, 15, 23 };
        print(a);
        lomutoPartition(a);
        print(a);
    }

}

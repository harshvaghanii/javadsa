package Sorting;

public class HoarePartition {

    public static int hoarePartition(int[] a) {
        int n = a.length;
        int pivot = a[0];
        int i = -1;
        int j = n;

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
        int[] a = { 12, 15, 78, 4, 7, 15, 3 };
        print(a);
        int res = hoarePartition(a);
        print(a);
        System.out.println("The result is :" + res);
    }
}
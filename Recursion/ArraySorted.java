package Recursion;

public class ArraySorted {
    public static boolean isSorted(int[] a) {
        if (a.length < 2)
            return true;
        int count = 1;
        return isSortedUtil(a, count);
    }

    public static boolean isSortedUtil(int[] a, int count) {
        if (count >= a.length)
            return true;
        if (a[count] < a[count - 1])
            return false;
        else
            return isSortedUtil(a, count + 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 1, 3, 45, 2 };
        int[] c = { 5 };
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
        System.out.println(isSorted(c));
    }

}

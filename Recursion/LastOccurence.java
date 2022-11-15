package Recursion;

public class LastOccurence {
    public static int lastOccurence(int[] a, int key) {
        return lastOccurenceUtil(a, a.length - 1, key);
    }

    public static int lastOccurenceUtil(int[] a, int index, int key) {
        if (index < 0)
            return -1;
        if (a[index] == key)
            return index;
        return lastOccurenceUtil(a, index - 1, key);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 4, 5 };
        System.out.println(lastOccurence(a, 5));
    }

}

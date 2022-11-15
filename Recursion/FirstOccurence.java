package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int[] a, int key) {
        return firstOccurenceUtil(a, 0, key);
    }

    public static int firstOccurenceUtil(int[] a, int index, int key) {
        if (index == a.length)
            return -1;
        if (a[index] == key)
            return index;
        return firstOccurenceUtil(a, index + 1, key);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 4, 5 };
        System.out.println(firstOccurence(a, 5));
    }
}

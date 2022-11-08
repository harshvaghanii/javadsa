package Arrays;

public class Pairs {
    public static void printPairs(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8, 10 };
        printPairs(a, a.length);
    }

}

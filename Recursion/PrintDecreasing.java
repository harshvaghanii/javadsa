package Recursion;

public class PrintDecreasing {

    public static void printDecreasing(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasing(n);
    }
}

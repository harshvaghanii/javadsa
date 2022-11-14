package Recursion;
public class PrintInDecreasingOrder {

    public static void printInDecreasingOrder(int n) {
        if (n <= 0)
            return;
        System.out.print(n + " ");
        printInDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printInDecreasingOrder(n);
        System.out.println();
    }
}

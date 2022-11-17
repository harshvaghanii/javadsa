package Recursion;

public class BinaryStrings {

    public static void printBinaryStrings(int n, String curr, int lastPlace) {
        if (n == 0) {
            System.out.println(curr + " ");
            return;
        }
        printBinaryStrings(n - 1, curr + "0", 0);
        if (lastPlace == 0)
            printBinaryStrings(n - 1, curr + "1", 1);
    }

    public static void main(String[] args) {
        printBinaryStrings(2, "", 0);
        System.out.println();
    }
}

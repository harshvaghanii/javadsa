package Recursion;

public class BinaryString {
    public static void printBinaryString(int n, String s, int previousPlace) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        printBinaryString(n - 1, s + "0", 0);
        if (previousPlace == 0) {
            printBinaryString(n - 1, s + "1", 1);
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, "", 0);
    }
}

package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n < 2)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println("The factorial is : " + factorial);
    }
}

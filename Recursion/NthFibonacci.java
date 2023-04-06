package Recursion;

public class NthFibonacci {
    public static int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 100;
        int fib = fib(n);
        System.out.println("The nth fibonacci number is : " + fib);
    }
}

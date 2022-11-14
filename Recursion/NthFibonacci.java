package Recursion;

public class NthFibonacci {
    public static int nthFibonacci(int n) {
        if (n < 2)
            return 1;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        int res = nthFibonacci(n);
        System.out.println("The result is : " + res);
    }

}

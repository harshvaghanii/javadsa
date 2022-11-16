package Recursion;

public class Power {
    static int count = 0;

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        count++;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 100;
        int res = power(x, n);
        System.out.println("The result is : " + res);
        System.out.println("The count is : " + count);
    }
}
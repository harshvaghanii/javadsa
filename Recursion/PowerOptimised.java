package Recursion;

public class PowerOptimised {

    static int count = 0;

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        if (n % 2 == 0) {
            count++;
            return power(x * x, n / 2);
        } else {
            count++;
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int res = power(x, n);
        System.out.println("The result is : " + res);
        System.out.println("The count is : " + count);
    }
}

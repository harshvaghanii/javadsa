package Recursion;

public class PowerOptimized {
    public static int count = 0;

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        if (b % 2 == 0) {
            count++;
            return power(a * a, b / 2);
        } else {
            count++;
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int ans = power(2, 10);
        System.out.println("The answer is : " + ans);
        System.out.println("The count is : " + count);
    }
}

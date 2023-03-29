package Recursion;

public class Power {
    public static int count = 0;

    public static int power(int a, int b) {
        // Base Case
        if (b == 0)
            return 1;

        // Condition
        count++;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int ans = power(2, 10);
        System.out.println("The answer is : " + ans);
        System.out.println("The count is : " + count);
    }

}

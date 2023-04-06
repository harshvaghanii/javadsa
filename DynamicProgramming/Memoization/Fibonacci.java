package DynamicProgramming.Memoization;

/*
 * This is a program to calculate Nth fibonacci number using Memoization approach of Dynamic Programming.
 */

public class Fibonacci {
    public static int fibonacci(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0)
            return dp[n];

        int res = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        dp[n] = res;
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n + 1];
        int ans = fibonacci(n, dp);
        System.out.println("The answer is : " + ans);
    }

}

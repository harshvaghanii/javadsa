package DynamicProgramming.Tabulation;

/*
 * This is a program to calculate Nth fibonacci number using Tabulation approach of Dynamic Programming.
 */

public class Fibonacci {
    public static int fibonacci(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        int ans = fibonacci(n, dp);
        System.out.println("The answer is : " + ans);
    }

}

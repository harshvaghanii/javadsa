package DynamicProgramming.Memoization;

public class ClimbingStairsVariation {
    public static int numberOfWays(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != 0)
            return dp[n];

        dp[n] = numberOfWays(n - 1, dp) + numberOfWays(n - 2, dp) + numberOfWays(n - 3, dp);
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        int ans = numberOfWays(n, dp);
        System.out.println("The number of ways to climb " + n + " stairs is " + ans);
    }

}

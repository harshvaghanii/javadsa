package DynamicProgramming.Tabulation;

public class ClimbingStairs {
    public static int numberOfWays(int n, int[] dp) {
        if (n < 0) {
            return 0;
        }

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        int ans = numberOfWays(n, dp);
        System.out.println("The number of ways to climb " + n + " stairs is " + ans);
    }

}

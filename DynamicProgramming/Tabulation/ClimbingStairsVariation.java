package DynamicProgramming.Tabulation;

public class ClimbingStairsVariation {
    public static int numberOfWays(int n, int[] dp) {

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        if (dp[n] != 0)
            return dp[n];

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        int ans = numberOfWays(n, dp);
        System.out.println("The number of ways to climb " + n + " stairs is " + ans);
    }

}

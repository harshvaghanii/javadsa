package DynamicProgramming.Tabulation;

public class KnapSack {
    public static int maxProfit(int[] weight, int[] value, int capacity) {

        int index = value.length;
        int[][] dp = new int[index + 1][capacity + 1];
        // Start filling the DP Array

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {

                // Number of Item is represented by i
                // Weight is represented by j
                int item_ignored = dp[i - 1][j];
                int item_included = 0;
                if (weight[i - 1] <= j) {
                    item_included = value[i - 1] + dp[i - 1][j - weight[i - 1]];
                }
                dp[i][j] = Math.max(item_ignored, item_included);
            }
        }
        print(dp);
        return dp[index][capacity];
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int[] weight = { 2, 5, 1, 3, 4 };
        int capacity = 7;
        int maxProfit = maxProfit(weight, val, capacity);
        System.out.println("The max Profit is : " + maxProfit);
    }

}

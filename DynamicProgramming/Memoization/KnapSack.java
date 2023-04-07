package DynamicProgramming.Memoization;

/*
 * This problem is a 0-1 Knapsack problem which is solved using Dynamic Programming Approach using Memoization.
 * 0-1 knapsack means we can either pick the item, or we can discard the item.
 */

public class KnapSack {
    public static int maxProfit(int[] val, int[] weight, int index, int capacity, int[][] dp) {
        if (index == 0 || capacity == 0) {
            return 0;
        }

        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }

        int zero = maxProfit(val, weight, index - 1, capacity, dp);
        int one = Integer.MIN_VALUE;
        if (weight[index - 1] <= capacity) {
            one = val[index - 1] + maxProfit(val, weight, index - 1, capacity -
                    weight[index - 1], dp);
        }
        dp[index][capacity] = Math.max(zero, one);
        return dp[index][capacity];

    }

    public static void fill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -1;
            }
        }
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
        // int val[] = { 60, 100, 120 };
        // int[] weight = { 10, 20, 30 };
        // int capacity = 50;
        int[][] dp = new int[val.length + 1][capacity + 1];
        fill(dp);
        int maxProfit = maxProfit(val, weight, val.length, capacity, dp);
        System.out.println("The max Profit is : " + maxProfit);
        print(dp);
    }

}

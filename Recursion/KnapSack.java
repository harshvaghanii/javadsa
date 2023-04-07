package Recursion;

/*
 * This problem is a 0-1 Knapsack problem which is solved using Recursive Approach.
 * 0-1 knapsack means we can either pick the item, or we can discard the item.
 */

public class KnapSack {
    public static int maxProfit(int[] val, int[] weight, int index, int capacity) {
        if (index == val.length || capacity == 0) {
            return 0;
        }
        int zero = maxProfit(val, weight, index + 1, capacity);
        int one = Integer.MIN_VALUE;
        if (weight[index] <= capacity) {
            one = val[index] + maxProfit(val, weight, index + 1, capacity - weight[index]);
        }
        return Math.max(zero, one);
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int[] weight = { 2, 5, 1, 3, 4 };
        int capacity = 7;
        int maxProfit = maxProfit(val, weight, 0, capacity);
        System.out.println("The max Profit is : " + maxProfit);
    }

}

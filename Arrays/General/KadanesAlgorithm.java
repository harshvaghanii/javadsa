package Arrays.General;

/*
 * Given an array, find the maximum possible sum of subarray.
 * This approach is done using Kadane's algorithm
 */

public class KadanesAlgorithm {
    public static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int curr_max = arr[0];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            currentSum += arr[i];
            curr_max = Math.max(curr_max, arr[i]);
            if (currentSum >= 0) {
                maxSum = Math.max(maxSum, currentSum);
            } else {
                currentSum = 0;
            }
        }

        return Math.max(curr_max, maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { 2, -6, 3, -4, 7 };
        int maxSum = maxSum(arr);
        System.out.println("The max sum is : " + maxSum);
    }

}

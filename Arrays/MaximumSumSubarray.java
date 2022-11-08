package Arrays;

public class MaximumSumSubarray {

    public static int maximumSumSubarrayPrefix(int[] a) {

        // Time Complexity : O(n)
        // Space Complexity : O(n)

        int n = a.length;
        int res = Integer.MIN_VALUE;

        int[] prefix = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }

        int prefix_min = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, prefix[i] - prefix_min);
            prefix_min = Math.min(prefix_min, prefix[i]);
        }

        return res;
    }

    public static int maximumSumSubarray(int[] a) {
        int n = a.length;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                curr_sum += a[j];
                if (curr_sum > max_sum)
                    max_sum = curr_sum;
            }
            curr_sum = 0;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, -2, 6, -1, 3 };
        // int max_sum = maximumSumSubarray(a);
        int max_sum = maximumSumSubarrayPrefix(a);
        System.out.println("The maximum sum is : " + max_sum);
    }
}

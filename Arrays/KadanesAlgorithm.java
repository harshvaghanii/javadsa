package Arrays;

public class KadanesAlgorithm {

    public static int maximumSumSubarray(int[] a) {
        int res = Integer.MIN_VALUE;
        int n = a.length;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a[i];
            if (curr_sum < 0)
                curr_sum = 0;
            else
                res = Math.max(res, curr_sum);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int max_sum = maximumSumSubarray(a);
        int max_sum = maximumSumSubarray(a);
        System.out.println("The maximum sum is : " + max_sum);
    }
}

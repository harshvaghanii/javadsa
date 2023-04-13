package Recursion;

public class TargetSumSubset {
    public static boolean targetSum(int[] arr, int target, int index, int sum) {
        if (index == arr.length)
            return false;
        if (sum == target)
            return true;
        return targetSum(arr, target, index + 1, sum) || targetSum(arr, target, index + 1, sum + arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 3 };
        int target = 2;
        boolean target_sum_exists = targetSum(arr, target, 0, 0);
        if (target_sum_exists) {
            System.out.println("The sum exists in the array!");
        } else {
            System.out.println("The target sum does not exist in the array!");
        }
    }

}

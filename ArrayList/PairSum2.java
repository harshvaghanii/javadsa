package ArrayList;

import java.util.*;

// Given a rotated sorted array, find pair that results in target sum
public class PairSum2 {

    public static ArrayList<Integer> pairSum(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        int pivot = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }

        int right_pointer = pivot, left_pointer = pivot + 1;

        while (left_pointer != right_pointer) {
            if (nums[left_pointer] + nums[right_pointer] == target) {
                res.add(left_pointer);
                res.add(right_pointer);
                break;
            }

            if (nums[left_pointer] + nums[right_pointer] > target) {
                right_pointer = (nums.length + right_pointer - 1) % nums.length;
            } else {
                left_pointer = (left_pointer + 1) % nums.length;
            }

        }

        return res;

    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };
        int target = 5;
        System.out.println("The pair forming the target sum is : " + pairSum(a, target));
    }
}

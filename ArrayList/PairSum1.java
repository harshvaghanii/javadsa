package ArrayList;

import java.util.ArrayList;
// Given a sorted array, find pair that results in target sum

public class PairSum1 {

    public static ArrayList<Integer> pairSum(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] + nums[j] == target) {
                res.add(i);
                res.add(j);
                break;
            } else if (nums[i] + nums[j] < target)
                i++;
            else
                j--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int target = 5;
        System.out.println("The pair forming the target sum is : " + pairSum(a, target));
    }
}

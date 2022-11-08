package Arrays;

public class LargestNumber {
    public static int largestIndex(int[] a) {
        int largest_index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[largest_index])
                largest_index = i;
        }
        return largest_index;
    }

    public static void main(String[] args) {
        int[] nums = { 35, 67, 37, 24, 73, 59 };
        int largest_index = largestIndex(nums);
        System.out.println(
                "The largest number is on index " + largest_index + " and the value is : " + nums[largest_index]);
    }
}

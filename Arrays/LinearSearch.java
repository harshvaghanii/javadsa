package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] a, int n) {
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 8, 3 };
        System.out.println(linearSearch(nums, 60));
    }

}
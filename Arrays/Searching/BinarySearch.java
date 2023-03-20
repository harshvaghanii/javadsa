package Arrays.Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    // Note : Sorted array is required

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8 };
        int target = 6;
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("Sorry, the target does not exist in the given list of numbers!");
        } else {
            System.out.println("The target is found at index : " + index);
        }
    }

}

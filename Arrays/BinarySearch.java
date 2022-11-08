package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] a, int n) {
        int index = -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == n) {
                index = mid;
                break;
            } else if (a[mid] > n)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] sorted_array = { 6, 7, 9, 13, 21, 45, 101, 102 };
        int index = binarySearch(sorted_array, 45);
        if (index == -1)
            System.out.println("The number is not present in the array!");
        else
            System.out.println("The number is present at index : " + index);
    }

}

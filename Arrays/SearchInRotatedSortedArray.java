package Arrays;

public class SearchInRotatedSortedArray {

    public static int search(int[] arr, int l, int h, int target) {
        if (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target)
                return mid;
            // Case 1 - Mid is on Line 1 : arr[l] <= arr[mid]
            if (arr[l] < arr[mid]) {
                // Case to search on the left of mid
                if (target < arr[mid] && arr[l] <= target) {
                    return search(arr, l, mid - 1, target);
                }
                // Case to search on the right of mid
                else {
                    return search(arr, mid + 1, h, target);
                }
            }
            // Case 2 - Mid is on Line 2 : arr[mid] <= arr[h]
            else {
                // Case to search on the right of mid
                if (arr[mid] < target && target <= arr[h]) {
                    return search(arr, mid + 1, h, target);
                }
                // Case to search on the left of mid
                else {
                    return search(arr, l, mid - 1, target);
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] sorted_array = { 21, 45, 101, 102, 6, 7, 9, 13 };
        int[] sorted_array = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = search(sorted_array, 0, sorted_array.length - 1, target);
        if (index == -1)
            System.out.println("The number is not present in the array!");
        else
            System.out.println("The number " + target + "is present at index : " + index);
    }
}

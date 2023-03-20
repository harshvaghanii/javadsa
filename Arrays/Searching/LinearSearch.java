package Arrays.Searching;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        int size = arr.length;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target)
                return i;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 8, 6 };
        int target = 8;
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Sorry, the target does not exist in the given list of numbers!");
        } else {
            System.out.println("The target is found at index : " + index);
        }
    }
}

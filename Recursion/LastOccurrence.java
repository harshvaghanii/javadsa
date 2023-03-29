package Recursion;

public class LastOccurrence {

    public static int search(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;
        int isFound = search(arr, index + 1, target);
        if (isFound != -1)
            return isFound;
        if (arr[index] == target)
            return index;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 3, 5 };
        int index = search(arr, 0, 5);
        if (index == -1) {
            System.out.println("The target is not present in the array.");
            return;
        }
        System.out.println("The last occurrence is : " + index);
    }
}

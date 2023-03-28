package Recursion;

public class FirstOccurrence {
    public static int search(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 3, 5 };
        int index = search(arr, 0, 50);
        if (index == -1) {
            System.out.println("The target is not present in the array.");
            return;
        }
        System.out.println("The first occurrence is : " + index);
    }

}

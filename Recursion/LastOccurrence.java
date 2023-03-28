package Recursion;

public class LastOccurrence {

    public static int search(int[] arr, int index, int target, int occurrence) {
        if (index == arr.length)
            return occurrence;
        if (arr[index] == target)
            occurrence = index;
        return search(arr, index+1, target, occurrence);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 3, 5 };
        int index = search(arr, 0, 5, -1);
        if (index == -1) {
            System.out.println("The target is not present in the array.");
            return;
        }
        System.out.println("The last occurrence is : " + index);
    }
}

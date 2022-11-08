package Sorting;

public class CountSort {

    // Used to sort an array of 0, 1 and 2

    public static void countSort(int[] nums) {
        int n = nums.length;
        int[] count = new int[3];

        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i <= 2; i++) {
            while (count[i] != 0) {
                nums[index++] = i;
                count[i]--;
            }
        }
    }

    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Printing the unsorted array : ");
        print(arr);
        countSort(arr);
        System.out.println("Printing the sorted array : ");
        print(arr);
    }

}

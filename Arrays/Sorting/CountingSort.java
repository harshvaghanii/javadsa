package Arrays.Sorting;

public class CountingSort {
    public static void sort(int[] arr, int max) {
        int[] count = new int[max + 1];
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 5, 4, 9 };
        // int[] arr = { 2, 0, -1, 2, 1 };
        System.out.println("Printing the original Array");
        print(arr);
        sort(arr, 9);
        System.out.println("Printing the sorted Array");
        print(arr);
    }
}

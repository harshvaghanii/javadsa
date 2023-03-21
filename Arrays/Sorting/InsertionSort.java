package Arrays.Sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j > -1 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        sort(arr);
        System.out.println("Printing the sorted Array");
        print(arr);
    }
}

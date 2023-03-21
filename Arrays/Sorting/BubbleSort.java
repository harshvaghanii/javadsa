package Arrays.Sorting;

public class BubbleSort {

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isSorted)
                break;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = { 7, 1, 2, 5, 4, 9 };
        int[] arr = { 2, 0, -1, 2, 1 };
        System.out.println("Printing the original Array");
        print(arr);
        sort(arr);
        System.out.println("Printing the sorted Array");
        print(arr);
    }
}

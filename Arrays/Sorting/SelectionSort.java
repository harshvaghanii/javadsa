package Arrays.Sorting;

public class SelectionSort {

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            if (min_index == i)
                continue;
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

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

package Arrays.General;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int size = arr.length;
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array : ");
        print(arr);
        reverse(arr);
        System.out.println("Reversed Array : ");
        print(arr);
    }

}

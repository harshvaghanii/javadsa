package Arrays;

public class ReverseArray {
    public static void reverseArray(int[] a) {
        int first = 0;
        int last = a.length - 1;
        int iterations = 0;
        while (first < last) {
            iterations++;
            int temp = a[first];
            a[first++] = a[last];
            a[last--] = temp;
        }
        System.out.println("Number of iterations : " + iterations);
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Printing the main array : ");
        printArray(arr);
        System.out.println("Reversing the array and printing the reversed array : ");
        reverseArray(arr);
        printArray(arr);
    }

}

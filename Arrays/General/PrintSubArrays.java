package Arrays.General;

public class PrintSubArrays {
    public static void printSubArrays(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            String toPrint = "";
            for (int j = i; j < size; j++) {
                toPrint += arr[j];
                System.out.println(toPrint.trim());
                toPrint += " ";
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 9 };
        printSubArrays(arr);
    }

}

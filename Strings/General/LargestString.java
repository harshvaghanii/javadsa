package Strings.General;

public class LargestString {
    public static String largestString(String[] arr) {
        int size = arr.length;
        String largestString = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i].compareToIgnoreCase(largestString) > 0) {
                largestString = arr[i];
            }
        }
        return largestString;
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "mango", "banana" };
        String largestString = largestString(arr);
        System.out.println("The largest string is : " + largestString);
    }

}

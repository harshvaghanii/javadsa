package Strings.General;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        int length = s.length();
        if (length < 2)
            return true;
        int i = 0, j = length - 1;
        String temp = s.toLowerCase();
        while (i <= j) {
            if (temp.charAt(i++) != temp.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Raacecar";
        if (isPalindrome(s)) {
            System.out.println("The string is palindrome!");
        } else {
            System.out.println("The string is not palindrome!");
        }
    }
}

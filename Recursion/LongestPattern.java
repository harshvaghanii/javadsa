package Recursion;

/*
 * aabbbccccc
 * longest = "a"
 * length = 1
 */

public class LongestPattern {
    public static void printLongestPattern(String s, int index, String current, String longest, int length) {

        if (index == s.length()) {
            System.out.println(longest);
            return;
        }

        if (s.charAt(index) == s.charAt(index - 1)) {
            if (current.length() + 1 > longest.length()) {
                length = current.length();
                longest = current + s.charAt(index);
            }
            printLongestPattern(s, index + 1, current + s.charAt(index), longest, length + 1);
        } else {
            printLongestPattern(s, index + 1, String.valueOf(s.charAt(index)), longest, longest.length());
        }
    }

    public static void main(String[] args) {
        String s = "aabbbbaaccdabcaaaaaaaab";
        printLongestPattern(s, 1, String.valueOf(s.charAt(0)), String.valueOf(s.charAt(0)), 1);
    }

}

package Recursion;

public class LongestPattern {

    public static String longestString(String s, String curr, String max, int index) {
        if (index == s.length())
            return max;
        if (curr.length() == 0 || s.charAt(index) == s.charAt(index - 1))
            curr += s.charAt(index);
        else
            curr = String.valueOf(s.charAt(index));
        if (curr.length() >= max.length())
            max = curr;
        return longestString(s, curr, max, index + 1);

    }

    public static void main(String[] args) {
        String s = "aabbbbaaccdabcaaaaaaaab";
        String res = longestString(s, "", "", 0);
        System.out.println("The result is : " + res);
    }
}

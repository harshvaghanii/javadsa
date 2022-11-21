package Recursion;

public class PrintSubStrings {

    public static void printSubStrings(String s, String ans, int index) {
        if (index == s.length()) {
            if (ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }
        printSubStrings(s, ans + s.charAt(index), index + 1);
        printSubStrings(s, ans, index + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubStrings(s, "", 0);
    }

}

package Backtracking;

public class StringPermutation {

    public static void printPermutations(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char curr_char = s.charAt(i);
            printPermutations(s.substring(0, i) + s.substring(i + 1), ans + curr_char);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        printPermutations(s, "");
    }
}

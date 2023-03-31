package Backtracking;

public class PrintSubsets {
    public static void printSubsets(String s, int index, String curr) {
        if (index == s.length()) {
            if (curr.trim().equalsIgnoreCase(""))
                System.out.println("null");
            else
                System.out.println(curr);
            return;
        }

        printSubsets(s, index + 1, curr + s.charAt(index));
        printSubsets(s, index + 1, curr);

    }

    public static void main(String[] args) {
        String s = "abc";
        printSubsets(s, 0, "");
    }

}

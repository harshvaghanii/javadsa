package Recursion;

public class DuplicateString {

    public static String removeDuplicates(String s) {
        boolean[] map = new boolean[26];
        StringBuilder res = new StringBuilder("");
        return removeDuplicatesUtil(s, map, res, 0);
    }

    public static String removeDuplicatesUtil(String s, boolean[] map, StringBuilder res, int index) {
        if (index == s.length())
            return res.toString();
        if (!map[s.charAt(index) - 'a']) {
            map[s.charAt(index) - 'a'] = true;
            res.append(s.charAt(index));
        }
        return removeDuplicatesUtil(s, map, res, index + 1);
    }

    public static void main(String[] args) {
        String s = "appnnacollege";
        String res = removeDuplicates(s);
        System.out.println("The result is : " + res);
    }
}

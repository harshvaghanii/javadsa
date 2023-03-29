package Recursion;

public class RemoveDuplicates {
    public static String removeDuplicates(String s, StringBuilder sb, int index, boolean[] map) {
        if (index == s.length())
            return sb.toString();
        if (!map[s.charAt(index) - 97]) {
            map[s.charAt(index) - 97] = true;
            sb.append(s.charAt(index));
            return removeDuplicates(s, sb, index + 1, map);
        } else {
            return removeDuplicates(s, sb, index + 1, map);
        }
    }

    public static void main(String[] args) {
        String s = "apnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean[] map = new boolean[26];
        String unique = removeDuplicates(s, sb, 0, map);
        System.out.println("The unique string is : " + unique);
    }

}

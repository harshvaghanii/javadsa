package Strings.General;

public class Compression {

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder("");

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if (count > 1)
                sb.append(String.valueOf(count));
            count = 1;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcccdd";
        System.out.println("The original String : " + s);
        System.out.println("--------------------");
        String compressed_string = compress(s);
        System.out.println("The compresses String : " + compressed_string);
    }
}

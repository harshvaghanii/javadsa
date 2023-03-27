package Strings.General;

public class UpperCase {

    public static String convert(String s) {
        StringBuilder converted_string = new StringBuilder("");

        converted_string.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                converted_string.append(s.charAt(i++));
                converted_string.append(Character.toUpperCase(s.charAt(i)));
            } else {
                converted_string.append(s.charAt(i));
            }
        }

        return converted_string.toString();

    }

    public static void main(String[] args) {
        String s = "hi, i am harsh! and i am awesome!!!";
        System.out.println("Printing the original string : ");
        System.out.println(s);
        System.out.println("Printing the converted string : ");
        System.out.println(convert(s));
    }
}

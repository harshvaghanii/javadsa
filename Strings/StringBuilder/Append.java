package Strings.StringBuilder;

public class Append {

    public static StringBuilder appendCharacters(StringBuilder sb) {
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println("The appended String is : " + appendCharacters(sb));
    }
}

package Recursion;

public class Sum {

    public static int sum(int n) {
        if (n < 1)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = sum(n);
        System.out.println("The result is : " + res);
    }

}

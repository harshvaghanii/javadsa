package Recursion;

public class RopeCutting {

    public static int maxCutting(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = Math.max(maxCutting(n - a, a, b, c),
                Math.max(maxCutting(n - b, a, b, c), maxCutting(n - c, a, b, c)));
        if (res >= 0)
            return 1 + res;
        return -1;
    }

    public static void main(String[] args) {
        int res = maxCutting(5, 4, 3, 6);
        System.out.println("The result is : " + res);
        res = maxCutting(5, 5, 1, 2);
        System.out.println("The result is : " + res);
    }
}

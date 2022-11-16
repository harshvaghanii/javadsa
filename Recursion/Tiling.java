package Recursion;

public class Tiling {

    public static int numberOfWaysForTiling(int n) {
        if (n < 2)
            return 1;
        int vertical_tiling = numberOfWaysForTiling(n - 1);
        int horizontal_tiling = numberOfWaysForTiling(n - 2);
        int total = vertical_tiling + horizontal_tiling;
        return total;

    }

    public static void main(String[] args) {
        int n = 3;
        int res = numberOfWaysForTiling(n);
        System.out.println("The result is : " + res);
    }
}

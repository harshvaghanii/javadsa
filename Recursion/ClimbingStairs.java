package Recursion;

public class ClimbingStairs {
    public static int numberOfWays(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return numberOfWays(n - 1) + numberOfWays(n - 2);

    }

    public static void main(String[] args) {
        int n = 4;
        int ans = numberOfWays(n);
        System.out.println("The number of ways to climb " + n + " stairs is " + ans);
    }

}

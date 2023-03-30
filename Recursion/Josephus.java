package Recursion;

public class Josephus {
    public static int josephus(int n, int k) {
        if (n == 1)
            return 0;
        int winner = josephus(n - 1, k);
        return (winner + k) % n;
    }

    public static void main(String[] args) {
        int n = 5, k = 3;
        int winner = josephus(n, k);
        System.out.println("The winner of the game is : " + winner);
    }

}

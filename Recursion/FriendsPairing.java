package Recursion;

public class FriendsPairing {
    public static int numberOfPairs(int n) {
        if (n < 3)
            return n;
        return numberOfPairs(n - 1) + (n - 1) * numberOfPairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        int numberOfPairs = numberOfPairs(n);
        System.out.println("The number of arrangements possible are : " + numberOfPairs);
    }

}

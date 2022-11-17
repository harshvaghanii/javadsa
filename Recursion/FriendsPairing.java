package Recursion;

public class FriendsPairing {

    public static int pairing(int n) {

        if (n == 1 || n == 2)
            return n;

        int single_choices = pairing(n - 1);
        int pair_choices = (n - 1) * pairing(n - 2);
        return single_choices + pair_choices;
    }

    public static void main(String[] args) {
        int friends = 4;
        int res = pairing(friends);
        System.out.println("The result is : " + res);
    }
}
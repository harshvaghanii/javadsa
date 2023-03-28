package Recursion;

public class SumOfNumbers {
    public static int sum(int n) {
        if (n < 2)
            return n;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n);
        System.out.println("The sum of the numbers is : " + sum);
    }

}

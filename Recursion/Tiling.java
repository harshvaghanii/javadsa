package Recursion;

/*
 * The idea behind the problem is that we have 2*1 tiles and 2*n floor.
 * Therefore, if we place the tile horizontally, then we will have to find out the ways for n-2 width
 * and if we place the tile veritcally, then we have to find the ways for n-1 width.
 * The total number of ways if the addition of horizontal and vertical ways
 */

public class Tiling {
    public static int fillTiles(int n) {

        if (n == 0 || n == 1)
            return 1;
        if (n < 4)
            return n;

        return fillTiles(n - 1) + fillTiles(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int number_of_ways = fillTiles(n);
        System.out.println("The total number of ways are : " + number_of_ways);
    }

}

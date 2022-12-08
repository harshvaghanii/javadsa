package Greedy;

import java.util.*;

// Given an array of Weight of Items and Values of Items, and a knapsack with a maximum capacity of weight, find out the maximum value that we can.

public class FractionalKnapsack {

    public static int maximumValue(int[] weight, int[] value, int total_capacity) {
        int max_value = 0;
        int remaining_capacity = total_capacity;
        int n = weight.length;
        // Creating an array of ratios
        // Since it is a greedy approach, we would pick the items having high value and
        // low weight

        double[] ratio = new double[n];

        for (int i = 0; i < n; i++) {
            ratio[i] = value[i] / (double) weight[i];
        }

        double[][] sorted = new double[n][2];

        for (int i = 0; i < n; i++) {
            sorted[i][0] = i;
            sorted[i][1] = ratio[i];
        }

        Arrays.sort(sorted, Comparator.comparingDouble(o -> o[1]));

        for (int i = n - 1; i >= 0; i--) {
            int index = (int) sorted[i][0];
            if (remaining_capacity >= weight[index]) {
                remaining_capacity -= weight[index];
                max_value += value[index];
            } else {
                max_value += remaining_capacity * ratio[index];
                remaining_capacity = 0;
            }
        }

        return max_value;
    }

    public static void main(String[] args) {
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        int total_capacity = 50;
        int max_value = maximumValue(weight, value, total_capacity);
        System.out.println("The maximum value that we can have is : " + max_value);
    }
}

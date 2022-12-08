package Greedy;

import java.util.*;
// Given an array of start time and end times of activities, where the activities are sorted on the basis of the end times,

// find out the maximum activities that a person can do. Assume that one person can only perform one activity at a time.

public class ActivitySelection {

    public static ArrayList<Integer> maximumActivity(int[] start, int[] end) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= end[i - 1])
                res.add(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        ArrayList<Integer> activities = maximumActivity(start, end);
        System.out.println(activities);
    }
}

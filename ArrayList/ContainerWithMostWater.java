package ArrayList;

// This same problem can be done using Array list too!

// Leetcode 11

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxAmount = 0;

        int i = 0, j = height.length - 1;
        while (i < j) {
            maxAmount = Math.max(maxAmount, (j - i) * Math.min(height[i], height[j]));

            if (height[i] <= height[j])
                i++;
            else
                j--;
        }
        return maxAmount;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxWater = maxArea(height);
        System.out.println("The maximum water that can be stored is : " + maxWater);
    }

}

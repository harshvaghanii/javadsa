package Arrays;

public class TrappingRainwater {
    public static int trap(int[] height) {

        int res = 0;

        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        right[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (height[i] == left[i] || height[i] == right[i])
                continue;
            res += Math.min(left[i], right[i]) - height[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int amount = trap(height);
        System.out.println("The amount of rainwater trapped is : " + amount);
    }
}

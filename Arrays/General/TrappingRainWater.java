package Arrays.General;

public class TrappingRainWater {

    public static int totalVolume(int[] height) {
        int total = 0;

        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        right[size - 1] = height[size - 1];
        int i = 1;
        int j = size - 2;

        // Constructing the left and the right auxillary arrays

        while (i < size) {
            left[i] = Math.max(height[i], left[i - 1]);
            right[j] = Math.max(height[j], right[j + 1]);
            i++;
            j--;
        }

        for (int k = 0; k < size; k++) {
            total += Math.min(left[k], right[k]) - height[k];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 6, 3, 2, 8 };
        int total_volume = totalVolume(heights);
        System.out.println("The total rain water trapped is : " + total_volume);
    }
}

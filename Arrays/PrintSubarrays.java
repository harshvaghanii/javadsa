package Arrays;

public class PrintSubarrays {

    public static int printSubarrays(int[] a) {
        int n = a.length;
        int total_pairs = 0;
        String curr_subarr = "";
        for (int i = 0; i < n; i++) {
            curr_subarr += a[i];
            total_pairs++;
            System.out.print("(" + curr_subarr + ") ");
            for (int j = i + 1; j < n; j++) {
                curr_subarr += ", " + a[j];
                total_pairs++;
                System.out.print("(" + curr_subarr + ") ");
            }
            curr_subarr = "";
            System.out.println();
        }
        return total_pairs;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int total_pairs = printSubarrays(a);
        System.out.println("The total sub array pairs are : " + total_pairs);
    }
}

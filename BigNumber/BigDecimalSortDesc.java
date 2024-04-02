import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSortDesc {
    public static void main(String[] args) {
        // Input array of real number strings

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] nums;
        nums = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            nums[i] = String.valueOf(in.next());


        }
        // Sort the array in descending order while preserving format
        Arrays.sort(nums, new BigDecimalComparator());

        // Print the sorted array

        for (String number : nums) {
            System.out.println(number);
        }
    }

    // Custom comparator to sort BigDecimal strings by numerical value
    static class BigDecimalComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Handle zero-padded strings as equivalent numerically
            s1 = s1.replaceFirst("^0+(?!$)", "");
            s2 = s2.replaceFirst("^0+(?!$)", "");

            // Convert strings to BigDecimal for comparison
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);

            // Compare by numerical value in descending order
            return bd2.compareTo(bd1);
        }
    }
}

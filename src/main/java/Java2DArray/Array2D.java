package Java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        Integer[] sums = new Integer[16];

        // Calculate all sums
        int idx = 0;
        for (int rowStart = 0; rowStart <= 3; rowStart++) {
            for (int colStart = 0; colStart <= 3; colStart++) {
                sums[idx++] = calculateSum(arr, rowStart, colStart);
            }
        }

        // Find the maximum sum
        int maxSum = Collections.max(Arrays.asList(sums));
        System.out.println(maxSum);
    }

    // Helper function to calculate sum for a 3x3 hourglass-like structure
    private static int calculateSum(List<List<Integer>> arr, int rowStart, int colStart) {
        int sum = 0;

        // Top row
        sum += arr.get(rowStart).get(colStart);
        sum += arr.get(rowStart).get(colStart + 1);
        sum += arr.get(rowStart).get(colStart + 2);

        // Middle row
        sum += arr.get(rowStart + 1).get(colStart + 1);

        // Bottom row
        sum += arr.get(rowStart + 2).get(colStart);
        sum += arr.get(rowStart + 2).get(colStart + 1);
        sum += arr.get(rowStart + 2).get(colStart + 2);

        return sum;
    }
}
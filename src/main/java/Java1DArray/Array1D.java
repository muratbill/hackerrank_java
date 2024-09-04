package Java1DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;



public class Array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.generate(() -> {
                    try {
                        return bufferedReader.readLine().trim();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .limit(n)  // Limit the stream to read only n lines
                .filter(line -> !line.isEmpty())  // Ensure line is not empty
                .map(Integer::parseInt)  // Convert each line to Integer
                .toList();




        bufferedReader.close();
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}

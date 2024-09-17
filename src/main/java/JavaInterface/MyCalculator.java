package JavaInterface;

import java.util.stream.IntStream;

class MyCalculator implements AdvancedArithmetic {

    int[] divisors = IntStream.rangeClosed(1,1000).toArray();
    @Override
    public int divisor_sum(int n) {
        int sum = n;
        if(n == 1) {
            sum = 1;
            return sum;
        }
        for (int divisor : divisors) {

            if (n % divisor == 0 & n != divisor) {
                sum += divisor;
            }
        }

        return sum;
    }
}

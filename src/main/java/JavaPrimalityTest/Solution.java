package JavaPrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
      String result;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number: ");
        String n = bufferedReader.readLine();
        BigInteger sayi = new BigInteger(n);
        result = (sayi.isProbablePrime(1))? "prime" : "not prime";
        System.out.println(result);

        bufferedReader.close();
    }
}

package JavaBigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigIntExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number1: ");
        String a = bufferedReader1.readLine();
        System.out.println("Enter your number2: ");
        String b = bufferedReader1.readLine();
        BigInteger sayi1 = new BigInteger(a);
        BigInteger sayi2 = new BigInteger(b);
        System.out.println(sayi1.add(sayi2));
        System.out.println(sayi1.multiply(sayi2));
    }
}

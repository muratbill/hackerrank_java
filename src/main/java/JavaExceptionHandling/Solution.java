package JavaExceptionHandling;
import java.io.*;
import java.util.*;
class Solution {


    public static void main(String[] args) throws IOException {


        try {
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int resul;
            resul = num1 / num2;
            System.out.println(resul);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
         catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}

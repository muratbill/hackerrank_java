package JavaInterface;

import java.util.Scanner;

public class InterfaceSolution {
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(obj.divisor_sum(num));
    }
}

package JavaInheritance2;

public class Solution {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println("My superclass is: " + obj.getClass().getSuperclass().getName());
        System.out.println(obj.add(8,9) + " " + obj.add(10,11) + " " + obj.add(14,23));

    }
}

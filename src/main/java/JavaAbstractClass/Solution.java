package JavaAbstractClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {

        MyBook obj = new MyBook();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mas = reader.readLine();
        obj.setTitle(mas);
        System.out.println(mas);
    }
}

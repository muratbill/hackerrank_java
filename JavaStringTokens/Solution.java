import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();

        if (s.length() == 0) {
            System.out.println("0");
        } else {
            String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }  
        
        
    
    
    
    }
  }

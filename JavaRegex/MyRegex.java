import java.io.*;
import java.util.*;
import java.util.regex.*;

public class MyRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner s = new Scanner(System.in);
        ArrayList<Boolean> arrayLines = new ArrayList<>();
        while (s.hasNextLine()) { //no need for "== true"
            String read = s.nextLine();
            if (read == null || read.isEmpty()) { //if the line is empty
                break;  //exit the loop
            }

            Boolean match = Pattern.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", read);
            arrayLines.add(match);


        }
        for(int i=0; i<arrayLines.size();i++){
            System.out.println(arrayLines.get(i));
        }
    
    }
}

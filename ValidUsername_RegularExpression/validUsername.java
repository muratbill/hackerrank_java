import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validUsername {

    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]+$";
        Pattern p = Pattern.compile(regex);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            if (m.find() && input.length() >=8 && input.length() <= 30) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }


        }
        in.close();
    }
}

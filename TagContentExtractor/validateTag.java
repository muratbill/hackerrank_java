import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateTag {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            System.out.println(tagContentExtractor(line));

            testCases--;
        }
        in.close();
    }

    private static String tagContentExtractor(String line) {
        Pattern pattern = Pattern.compile("<(.+?)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group(2)).append('\n');
        }

        return result.length() > 0 ? result.toString().trim() : "None";
    }
}

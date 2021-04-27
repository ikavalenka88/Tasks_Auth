package RegexpTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForText {

    private static final Pattern stringPattern = Pattern.compile("[a-z](?=a)",Pattern.CASE_INSENSITIVE); //(?<!a)d || [\S]\Qa || .(?<=a)
    public static void validate (String text){
//    public static void validate (Scanner text){
        Matcher matcher = stringPattern.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()));
        }
    }
}

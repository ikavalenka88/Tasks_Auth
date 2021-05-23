package RegexpTask.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForText {
    private static final Pattern stringPattern = Pattern.compile("[a-zA-Z](?=a)");
    public static void validate (String text){
        Matcher matcher = stringPattern.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()));
        }
    }
}

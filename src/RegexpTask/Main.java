package RegexpTask;

import RegexpTask.util.PatternForText;

public class Main {
    public static void main(String args[]) {
        String text = "The best day in a week is Friday";
        System.out.println("The results: " );
        PatternForText.validate(text);
    }
}

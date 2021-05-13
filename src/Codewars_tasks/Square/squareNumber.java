package Codewars_tasks.Square;

import java.util.stream.Collectors;

public class squareNumber {
    public static int square(int n){
        return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i->Integer.parseInt(String.valueOf((char)i)))
                    .map(i ->i*i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
//        String string = "";
//        String[] number = string.split("");
//        String result = "";
//        for (String stringTwo:number){
//            int i = Integer.parseInt(stringTwo);
//            result += i * i;
//        }
//        return Integer.parseInt(result);
    }
}

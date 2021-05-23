package Codewars_tasks.Square;

import java.util.stream.Collectors;

public class SquareNumber {
    public static int square(int n){
        return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i->Integer.parseInt(String.valueOf((char)i)))
                    .map(i ->i*i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
    }
}

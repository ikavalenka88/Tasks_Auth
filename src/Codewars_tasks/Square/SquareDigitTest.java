package Codewars_tasks.Square;

import java.util.Scanner;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareNumber().square(9119));
        assertEquals(0, new SquareNumber().square(0));
        assertEquals(64, new SquareNumber().square(8));
    }

}
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Please,enter number: ");
//        int n = scanner.nextInt();
//        System.out.println("The result of square each digit in number: " + squareNumber.square(n));
//    }
//}

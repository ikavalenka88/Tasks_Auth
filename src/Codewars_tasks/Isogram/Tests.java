package Codewars_tasks.Isogram;

import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Tests {
    @Test
    public void FixedTests() {
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Please,enter the word: ");
//        String string = scanner.next();
//        System.out.println(Isogam.check(string));
//    }
//}

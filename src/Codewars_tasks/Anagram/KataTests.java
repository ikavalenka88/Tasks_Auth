package Codewars_tasks.Anagram;

import static org.junit.Assert.*;
import org.junit.Test;

public class KataTests {
    @Test
    public void exampleTests() {
        Kata k = new Kata();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }
}
//        SortAnagram.sort();
//        SortAnagram.sort("real", "lear");
//        if (wordOne.length() == wordTwo.length()) {
//            char[] charArrayOne = wordOne.toCharArray();
//            char[] charArrayTwo = wordTwo.toCharArray();
//            Arrays.sort(charArrayOne);
//            Arrays.sort(charArrayTwo);
//            boolean result = Arrays.equals(charArrayOne, charArrayTwo);
//            if (result) {
//                System.out.println(wordOne +" "+ wordTwo + "  are satisfied requirement anagram. True");
//            } else {
//                System.out.println("False. Please check " + wordOne + " and " + wordTwo + " they are not satisfied requirement for anagram");
//            }
////            input.close();
//        }
////        //        return false;
//    }
//}

package Codewars_tasks.Anagram;

import java.util.Arrays;

public class Kata {
     boolean isAnagram(String test, String original) {
         if (original.length() != test.length()) {
             return false;
         } else {
             char[] charArrayOne = test.toLowerCase().toCharArray();
             char[] charArrayTwo = original.toLowerCase().toCharArray();
             Arrays.sort(charArrayOne);
             Arrays.sort(charArrayTwo);
             return Arrays.equals(charArrayOne, charArrayTwo);
         }
     }
    }
//            if (true) {
////                System.out.println(test +" "+ original + "  are satisfied requirement anagram. True");
//                return true;
//            } else {
////                System.out.println("False. Please check " + test + " and " + original + " they are not satisfied requirement for anagram");
//                return false;
//            }
//        }
//        if (test.length() != original.length()){
//            System.out.println("Words have different count letters");
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please! Enter the first word:");
//        String wordOne = input.nextLine();
//        System.out.println("Please! Enter the second word: ");
//        String wordTwo = input.nextLine();
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
//            input.close();
//        }
//        if (wordOne.length() != wordTwo.length()){
//            System.out.println("Words have different count letters");
//        }
//        return false;
//    }
//}

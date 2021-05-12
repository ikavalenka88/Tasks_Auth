package Codewars_tasks.Anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortAnagram {
    static boolean sort (char[] stringOne,char[] stringTwo) {
        int wordOne = stringOne.length;
        int wordTwo = stringTwo.length;
        if (wordOne!=wordTwo)
            return false;
        Arrays.sort(stringOne);
        Arrays.sort(stringTwo);
        for (int i=0;i<wordOne;i++)
            if (stringOne[i]!=stringTwo[i])
                return false;
            return true;
    }
}

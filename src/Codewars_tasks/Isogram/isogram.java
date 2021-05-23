package Codewars_tasks.Isogram;

import java.util.Arrays;

public class isogram {
    public static boolean isIsogram(String word){
        word = word.toLowerCase();
        int length = word.length();
        char array[] = word.toCharArray();
        Arrays.sort(array);
        for (int i =0;i<length -1;i++){
            if (array[i]==array[i+1])
                return false;
        }
        return true;
    }
}

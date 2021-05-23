package Codewars_tasks.TaskOddNumber;

import Codewars_tasks.TaskOddNumber.getOddNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class FindOddTest {

    @Test
    public void findTest() {
        assertEquals(5, getOddNumber.getOdd(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, getOddNumber.getOdd(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, getOddNumber.getOdd(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, getOddNumber.getOdd(new int[]{10}));
        assertEquals(10, getOddNumber.getOdd(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, getOddNumber.getOdd(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter size of array.");
//        int size = input.nextInt();
//        int array[] = new int[size];
//        System.out.println("Enter value for array. NOTE: THE ARRAY SHOULD HAVE ONE INTEGER THAT APPEARS AN ODD NUMBER OF TIMES");
//        for (int i =0;i<size;i++){
//            array[i]= input.nextInt();
//        }
//        System.out.println("The array: ");
//        for (int i =0;i<size;i++){
//            System.out.println(" "+ array[i]);
//        }
//        System.out.println("The odd number in array: " + getOddNumber.getOdd(array,size));
//    }
//}

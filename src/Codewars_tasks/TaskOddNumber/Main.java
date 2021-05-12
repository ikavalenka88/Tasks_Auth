package Codewars_tasks.TaskOddNumber;

import Codewars_tasks.TaskOddNumber.getOddNumber;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Enter value for array. The array should have one integer that appears an odd number of times");
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[]{};
        int arr [] = new int[]{1,2,2,3,1,3,3,3,4,4,4,4,4};
        int number = arr.length;
        System.out.println(getOddNumber.getOdd(arr,number));
    }
}

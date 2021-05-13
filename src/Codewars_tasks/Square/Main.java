package Codewars_tasks.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please,enter number: ");
        int n = scanner.nextInt();
        System.out.println("The result of square each digit in number: " + squareNumber.square(n));
    }
}

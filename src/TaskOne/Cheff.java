package TaskOne;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cheff {
    private String name;
    public Salat salat;
    int i;

    public Cheff() {
        name = "Dan";
        salat = new Salat();
    }

    //    public Cheff(String name){
//        this.name=name;
//        salat=new Salat();
//    }
//    public Cheff(String name,Salat salat){
//        this.name=name;
//        this.salat=salat;
//    }
    public Vegetables getCompositions(Scanner scanner) {
        String compositionName;
        double weight;
        System.out.println("Select ingredient:");
        compositionName = scanner.next();
        System.out.println("Weight:");
        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect weight!");
            scanner.next();
            return null;
        }
        try {

            Class[] parameters = {double.class};
            compositionName =  compositionName;
            Class compositionClass = Class.forName(compositionName);
            Constructor constructor = compositionClass.getDeclaredConstructor(parameters);
            Vegetables vegetables = (Vegetables) constructor.newInstance(new Object[]{weight});
            return vegetables;
        } catch (Exception e) {
            System.out.println("This ingredient is  absent!");
            return null;
        }
    }

    public void showCompositionForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;
        System.out.println("Lower limit:");
        try {
            lowerCalories = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            scanner.next();
            return;
        }
        System.out.println("Upper limit:");
        try {
            upperCalories = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            scanner.next();
            return;
        }
        salat.showIngredientsByCalories(lowerCalories, upperCalories);
    }

    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetables vegetables = null;
        System.out.println("Cheff: " + name);
        System.out.println("Select options:");
        while (choice != 0) {
            System.out.println("1. Add compositions");
            System.out.println("2. Sort compositions by calories");
            System.out.println("3. Sort compositions by weight");
            System.out.println("4. Show salad");
            System.out.println("0. Complete");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }
            switch (choice) {
                case 1:
//                    salat.addCompositions(); // I NEED HELP !!! I'm can't see resolve way.
                case 2:
                    salat.sortComponentsByCalories();
                    break;
                case 3:
                    salat.sortComponentsByWeight();
                    break;
                case 4:
                    salat.showSalat();
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            scanner.close();
        }
    }
}

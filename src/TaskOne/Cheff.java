package TaskOne;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cheff {
    private String name;
    public Salat salat;

    public Cheff() {
        name = "Dan";
        salat = new Salat();
    }

        public Cheff(String name){
        this.name=name;
        salat=new Salat();
    }
    public Cheff(String name,Salat salat){
        this.name=name;
        this.salat=salat;
    }
    public Vegetables getgetIngredient(Scanner scanner) {
        String ingredientName;
//        double weight;
        System.out.println("Enter ingredient:");
        ingredientName = scanner.next();
//        System.out.println("Weight:");
//        try {
//            weight = scanner.nextDouble();
//        } catch (InputMismatchException e) {
//            System.out.println("Incorrect weight!");
//            scanner.next();
//            return null;
//        }
        try {
            Class[] parameters = {double.class};
//            ingredientName =  compositionName;
            Class compositionClass = Class.forName(ingredientName);
            Constructor constructor = compositionClass.getDeclaredConstructor(parameters);
            Vegetables vegetables = (Vegetables) constructor.newInstance(new Object[]{});
            return vegetables;
        } catch (Exception e) {
            System.out.println("This ingredient is  absent!");
            return null;
        }
   }

    public void showIngredientsForCalories(Scanner scanner) {
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
            System.out.println("1. Add ingredient");
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
                    vegetables = getgetIngredient(scanner);
                    if (vegetables != null){
                        if (!salat.addIngredients(vegetables)){
                            System.out.println("Trouble with adding ingredient");
                        }
                    }
                    break;
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

package TaskOne;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cheff {
    public String name;
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
    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;
        System.out.println("Enter ingredient:");
        ingredientName = scanner.next();
        System.out.println("Input the Weight(gramms):");
        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect weight!");
            scanner.next();
            return null;
        }
        try {
            Class[] parameters = {double.class};
            ingredientName = "TaskOne." + ingredientName;// here some trouble. Need fix  and refactor
            Class compositionClass = Class.forName(ingredientName);
            Constructor constructor = compositionClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(new Object[]{weight});
            return vegetable;
        } catch (Exception e) {
            System.out.println("This ingredient is absent!");
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
        Vegetable vegetable = null;
        System.out.println("The Chef: " + name);
        while (choice != 0) {
            System.out.println("Select options please:");
            System.out.println("1. Add ingredient");
            System.out.println("2. Sort compositions by calories");
            System.out.println("3. Sort compositions by weight");
            System.out.println("4. Show salad");
            System.out.println("5. Show ingredients for calories");
            System.out.println("6. Name for Salad ");
            System.out.println("0. Complete");

            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }
            switch (choice) {
                case 1:
                    vegetable = getIngredient(scanner);
                    if (vegetable!= null){
                        if (!salat.addIngredient(vegetable)){
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
                case 5:
                    showIngredientsForCalories(scanner);
                    break;
                case 6:
                    System.out.println("Enter name foe salad: ");
                    salat.setName(scanner.next());
                    break;
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

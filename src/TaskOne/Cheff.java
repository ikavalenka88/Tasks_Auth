package TaskOne;

import TaskOne.dto.*;

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

    public Cheff(String name) {
        this.name = name;
        salat = new Salat();
    }

    public Cheff(String name, Salat salat) {
        this.name = name;
        this.salat = salat;
    }

    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;
        System.out.println("Select ingredient: ");
        System.out.println("1.Cabbage "+"\n"+"2.Carrot"+"\n"+"3.Cucumber"+"\n"+"4.Dill"+"\n"+"5.OilOlive"+"\n"+"6.Potato"+"\n"+"7.Tomato");
        int vegetableSelected = scanner.nextInt();
//        System.out.println("Enter ingredient:");
//        ingredientName = scanner.next();
        System.out.println("Input the Weight(gramms):");
        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect weight!");
            scanner.next();
            return null;
        }
        if (vegetableSelected ==1){
            return new Cabbage(weight);
        } else if (vegetableSelected==2){
            return new Carrot(weight);
        }else if (vegetableSelected==3){
            return new Cucumber(weight);
        }else if (vegetableSelected==4){
            return new Dill(weight);
        }else if (vegetableSelected==5){
            return new OilOlive(weight);
        }else if (vegetableSelected==6){
            return new Potato(weight);
        }else if (vegetableSelected==7){
            return new Tomato(weight);
        }
//        try {
//            Class[] parameters = {double.class};
//            ingredientName = "TaskOne.dto."+ ingredientName;      // working example with reflection
//            Class compositionClass = Class.forName(ingredientName);
//            Constructor constructor = compositionClass.getDeclaredConstructor(parameters);
//            Vegetable vegetable = (Vegetable) constructor.newInstance(new Object[]{weight});
//            return vegetable;
//        } catch (Exception e) {
//            System.out.println("This ingredient is absent!");
//            return null;
//        }
        else {
            System.out.println("This ingredient is absent!");
        }
        return null;
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
        System.out.println("Select options please:");
        System.out.println("1. Add ingredient");
        System.out.println("2. Sort compositions by calories");
        System.out.println("3. Sort compositions by weight");
        System.out.println("4. Show salad");
        System.out.println("5. Show ingredients for calories");
        System.out.println("6. Name for Salad ");
        System.out.println("0. Complete");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Vegetable vegetable = null;
        System.out.println("The Chef: " + name);
        if(choice == 0) {
            System.exit(0);
        }else if (choice == 1) {
            vegetable = getIngredient(scanner);
            if (vegetable != null) {
                if (!salat.addIngredient(vegetable)) {
                    System.out.println("Trouble with adding ingredient");
                }
            }
        }  if (choice == 2) {
            salat.sortComponentsByCalories();
            System.out.println(salat.ingredients);
        }  if (choice == 3) {
            salat.sortComponentsByWeight();
            System.out.println(salat.ingredients);
        }  if (choice == 4) {
            salat.showSalat();
        }  if (choice == 5) {
            showIngredientsForCalories(scanner);
        }  if (choice == 6) {
            System.out.println("Enter name foe salad: ");
            salat.setName(scanner.next());
        }  if (choice==7){
            System.out.println("The List of options:");
            System.out.println("Select options please:");
            System.out.println("1. Add ingredient");
            System.out.println("2. Sort compositions by calories");
            System.out.println("3. Sort compositions by weight");
            System.out.println("4. Show salad");
            System.out.println("5. Show ingredients for calories");
            System.out.println("6. Name for Salad ");
            System.out.println("0. Complete");
        }
        else {
//            System.out.println("Was wrong option!");
            showOptions();
        }
//            try {                   // remove  try catch use  if
//                choice = scanner.nextInt();
//            }
//            catch (InputMismatchException e) {
//                System.out.println("Wrong option!");
//                scanner.next();
//                choice = -1;
//            }
//            switch (scanner.nextInt()) {        //instead choice
//            case 1:
//        }
//                    vegetable = getIngredient(scanner);
//                    if (vegetable!= null){
//                        if (!salat.addIngredient(vegetable)){
//                            System.out.println("Trouble with adding ingredient");
//                        }
//                    }
//                    break;
//                case 2:
//                    salat.sortComponentsByCalories();
//                    break;
//                case 3:
//                    salat.sortComponentsByWeight();
//                    break;
//                case 4:
//                    salat.showSalat();
//                case 5:
//                    showIngredientsForCalories(scanner);
//                    break;
//                case 6:
//                    System.out.println("Enter name foe salad: ");
//                    salat.setName(scanner.next());
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    break;
//            }
//            scanner.close();
//        }
//    }
//}
    }
}
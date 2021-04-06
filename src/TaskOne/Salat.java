package TaskOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salat {
    private List<Vegetable> ingredients = new ArrayList<Vegetable>();
    private String name;

    public Salat() {
        name = "New Salat";
    }

    public Salat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<?> getIngredients() {
//        return ingredients;
//    }


    public boolean addIngredients(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void showSalat() {
        if (ingredients.isEmpty()) {
            System.out.println("Please add some ingredients for the salad!");
            return;
        }
        System.out.println("The Salat " + name + "ingredients:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }
        System.out.println("Total: " + countCalories());
    }

    public double countCalories() {
        double calories = 0.0;
        for (Vegetable vegetables : ingredients) {
            calories += vegetables.getTotalCalories();
        }
        return calories;
    }

    public void sortComponentsByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());
    }

    public void sortComponentsByWeight() {
        Collections.sort(ingredients, new WeightComparator());
    }

    public void showIngredientsByCalories(double lowerCalories, double upperCalories) {
        double calories;
        System.out.println("Compositions for" + lowerCalories + ", " + upperCalories + ".");
        for (Vegetable vegetables : ingredients) {
            calories = vegetables.getCalories();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetables.getName() + ", " + vegetables.getCalories() + "on 100g");
            }
        }
    }

}

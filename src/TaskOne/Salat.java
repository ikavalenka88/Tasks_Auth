package TaskOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salat {
    public List<Vegetable> ingredients = new ArrayList<Vegetable>();
    private String name;


    public Salat() {
        name = "New Salad";
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

    public List<Vegetable> getIngredients() {
        return ingredients;
    }
    public boolean addIngredient(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void showSalat() {
        if (ingredients.isEmpty()) {
            System.out.println("Please add some ingredients for the salad!");
            return;
        }
        System.out.println("The Salad " + name + " ingredients:");
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
        ingredients.sort(new CaloriesComparator());
    }

    public void sortComponentsByWeight() {
        ingredients.sort(new WeightComparator());
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

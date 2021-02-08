package TaskOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salat {
    private List<Vegetables> ingredients = new ArrayList<Vegetables>();
    private String name;

    public Salat() {
        name = "SalatOne";
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

    public List<Vegetables> getIngredients() {
        return this.ingredients;
    }


    public boolean addIngredients(Vegetables veg) {
        return ingredients.add(veg);
    }

    public void showSalat() {
        if (ingredients.isEmpty()) {
            System.out.println("Please add some ingredients for the salad!");
            return;
        }
        System.out.println("The Salat " + name + "ingredients:");
        for (Vegetables vegetables : ingredients) {
            System.out.println(vegetables.toString());
        }
        System.out.println("Total: " + countCalories());
    }

    public double countCalories() {
        double calories = 0.0;
        for (Vegetables vegetables : ingredients) {
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
        for (Vegetables vegetables : ingredients) {
            calories = vegetables.getCalories();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetables.getName() + ", " + vegetables.getCalories() + "on 100g");
            }
        }
    }

}

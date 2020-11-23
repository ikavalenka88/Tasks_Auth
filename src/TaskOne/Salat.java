package TaskOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salat {
    private ArrayList<Vegetables> compositions = new ArrayList<Vegetables>();
    private static Vegetables[] vegetables = Vegetables.values();
    private String name;

    public Salat() {
        name = "SalatOne";
    }

//    public Salat(String name) {
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public List<Vegetables> getCompositions() {
        return this.compositions;
    }


//    public void addCompositions(Vegetables vegetables) {
//        return compositions.add();
//    }

    public void showSalat() {
        if (compositions.isEmpty()) {
            System.out.println("Please add some ingredients(compositions) for the salad!");
            return;
        }
        System.out.println("The Salat " + name + "compositions:");
        for (Vegetables vegetables :compositions) {
            System.out.println(vegetables.toString());
        }
        System.out.println("Total: " + countCalories());
    }

    public double countCalories() {
        double calories = 0.0;
        for (Vegetables vegetables : compositions) {
            calories += vegetables.getTotalCalories();
        }
        return calories;
    }

    public void sortComponentsByCalories() {
        Collections.sort(compositions, new CaloriesComparator());
    }

    public void sortComponentsByWeight() {
        Collections.sort(compositions, new WeightComparator());
    }

    public void showCompositionsByCalories(double lowerCalories, double upperCalories) {
        double calories;
        System.out.println("Compositions for" + lowerCalories + ", " + upperCalories + ".");
        for (Vegetables vegetables : compositions) {
            calories = vegetables.getCalories();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetables.name()+ ", " + vegetables.getCalories() + "on 100g");
            }
        }
    }

}

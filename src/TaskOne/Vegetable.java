package TaskOne;

 public class Vegetable {
    private String name;
    private String category;
    private double kcalPer100g;
    private double weight;
    public Vegetable(String name){this.name=name;}

    public Vegetable(String name, double calories) {
        if (calories <=0){
            throw new IllegalArgumentException("Invalid value of calories" +calories+"Please set correct value");
        }
        this.name=name;
        this.kcalPer100g=calories;
        this.weight=100;
    }

    public Vegetable(String name, double calories, double weight) {
        if (calories < 0) {
            throw new IllegalArgumentException("Cannot create vegetable with "
                    + calories + "kcal");
        }

        if (weight < Double.MIN_NORMAL) {
            throw new IllegalArgumentException("Cannot create " + weight
                    + "g of " + name);
        }

        this.name = name;
        this.kcalPer100g = calories;
        this.weight = weight;
    }

    public String toString() {
        String stringBuilder = "Ingredients:" + "Name: " + name +
                " Category: " + category +
                " Weight: " + weight +
                " Calories " + kcalPer100g +
                " !";
        return stringBuilder;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getCalories() {
        return kcalPer100g;
    }

    public double getWeight() {
        return weight;
    }

    public double getTotalCalories() {
        return kcalPer100g * weight / 100.0;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    protected void setCalories(double calories) {
        this.kcalPer100g = calories;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}

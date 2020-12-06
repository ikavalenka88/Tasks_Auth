package TaskOne;

public enum Vegetables {
    POTATO(1.2, 2, 3, 4, 1),
    TOMATO(0.2, 2, 3, 4, 2),
    CARROT(0.5, 2, 3, 4, 3),
    CABBAGE(0.7, 2, 3, 4, 4),
    PEPPER(1.6, 2, 3, 4, 5),
    CHILI_PEPPER(2.3, 2, 3, 4, 6),
    EGGPLANT(0.5, 2, 3, 4, 7),
    CAULIFLOWER(0.8, 2, 3, 4, 5),
    ONION(0.7, 2, 3, 4, 8),
    GARLIC(0.11, 2, 3, 4, 9),
    PARSLEY(1.01, 2, 3, 4, 5),
    CELERY(0.2, 2, 3, 4, 3),
    RADISH(0.1, 2, 3, 4, 4),
    CUCUMBER(0.21, 2, 3, 4, 5),
    LETTUCE(3.2, 2, 3, 4, 6),
    PUMPKIN(1.12, 2, 3, 4, 5),
    COURGETTE(0.34, 2, 3, 4, 2),
    PEA(0.5, 2, 3, 4, 5),
    CHICK_PEA(6.3, 2, 3, 4, 5),
    GREEN_ONION(1.1, 2, 3, 4, 8),
    BROCCOLI(1.34, 2, 3, 4, 7),
    SPINACH(0.3, 2, 3, 4, 5),
    CORN(0.6, 2, 3, 4, 5),
    YAM(0.3, 2, 3, 4, 8),
    BEETS(0.8, 2, 3, 4, 5),
    TURNIP(0.9, 2, 3, 4, 6),
    GINGER(0.91, 2, 3, 4, 5);


    private double calories;
    private double weight;
    private double proteins;
    private double fats;
    private double carbohydrates;

    Vegetables(double proteins, double carbohydrates, double fats, double calories, double weight) {
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.calories = calories;
        this.weight = weight;
    }

    public double getCalories() {
        return this.calories;
    }

    public double getCarbohydrates() {
        return this.carbohydrates;
    }

    public double getFats() {
        return this.fats;
    }

    public double getProteins() {
        return this.proteins;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getTotalCalories() {
        return calories * weight / 100.0;
    }

    public Vegetables[] showListCompositions() {
        return Vegetables.values();
    }
}

package TaskOne;

public class VegetableCategories extends Vegetable {
    public VegetableCategories(String name, double calories,double weight){
        super(name, calories, weight);
        setCategory("First category");
    }
    public VegetableCategories(String name,double calories){
        super(name,calories);
        setCategory("Fisrt category");
    }
}

package TaskOne.dto;

import TaskOne.VegetableCategories;

public class Cabbage extends VegetableCategories {
    public Cabbage(){
        super("Cabbage",13,40);
    }
    public Cabbage(double weight){super("Cabbage",13,weight);}
}

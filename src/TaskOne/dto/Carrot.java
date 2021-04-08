package TaskOne.dto;

import TaskOne.VegetableCategories;

public class Carrot extends VegetableCategories {
    public Carrot(){
        super("Carrot",13,24);
    }
    public Carrot(double weight){super("Carrot",13,weight);}
}

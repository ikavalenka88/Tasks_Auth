package TaskOne.dto;

import TaskOne.VegetableCategories;


public class Potato extends VegetableCategories {
    public Potato() {
        super("Potato", 80,30);
    }
    public Potato(double weight){super("Potato",80,weight);}
}

package TaskOne.dto;

import TaskOne.VegetableCategories;

public class Cucumber extends VegetableCategories {
    public Cucumber(){
        super("Cucumber",50,20);
    }
    public Cucumber(double weight){super("Cucumber",50,weight);}
}

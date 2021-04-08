package TaskOne.dto;

import TaskOne.VegetableCategories;
public class Tomato extends VegetableCategories {
    public Tomato(){
        super("Tomato",20,32);
    }
    public Tomato(double weight){super("Tomato",20,weight);}

}

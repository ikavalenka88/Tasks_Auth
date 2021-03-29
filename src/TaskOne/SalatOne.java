package TaskOne;

import TaskOne.dto.*;

public class SalatOne extends Salat{
    public SalatOne() {
        setName("SalatOne");

        addIngredients(new Potato());
        addIngredients(new Tomato());
        addIngredients(new OilOlive());
        addIngredients(new Cucumber());
        addIngredients(new Dill());
    }
}

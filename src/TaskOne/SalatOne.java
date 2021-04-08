package TaskOne;

import TaskOne.dto.*;

public class SalatOne extends Salat{
    public SalatOne() {
        setName("SalatOne");

        addIngredient(new Potato(22.6));
        addIngredient(new Tomato(35.6));
        addIngredient(new OilOlive(92));
        addIngredient(new Cucumber(100));
        addIngredient(new Dill(300));
    }
}

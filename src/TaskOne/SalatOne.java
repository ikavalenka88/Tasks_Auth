package TaskOne;

import TaskOne.dto.Cucumber;
import TaskOne.dto.Potato;
import TaskOne.dto.Tomato;

public class SalatOne extends Salat{
    public SalatOne() {
        setName("SalatOne");

        addIngredients(new Potato());
        addIngredients(new Tomato());
//        addIngredients(new Beta(250));
        addIngredients(new Cucumber());
    }
}

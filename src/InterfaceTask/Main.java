package InterfaceTask;

import InterfaceTask.dto.FahrenheitConverter;
import InterfaceTask.dto.KelvinConverter;
import InterfaceTask.dto.ReaumurConverter;
import InterfaceTask.util.BaseConverter;

import static InterfaceTask.util.BaseConverter.*;

public class Main {
    public static void main(String[] args) {
        BaseConverter objOne = new KelvinConverter();
        BaseConverter objTwo = new FahrenheitConverter();
        BaseConverter objThree = new ReaumurConverter();
        int value = degreeCelsius();
        System.out.println("The value of Degree: " + value + " Celsius");

        double convertedValueOne = objOne.convertFromCelsius(value);
        double convertedValueTwo = objTwo.convertFromCelsius(value);
        double convertedValueThree = objThree.convertFromCelsius(value);
        objOne.print(convertedValueOne);
        objTwo.print(convertedValueTwo);
        objThree.print(convertedValueThree);
    }
}

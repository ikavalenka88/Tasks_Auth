package InterfaceTask;

public class FahrenheitConverter extends BaseConverter{

    public FahrenheitConverter() {
        super(" Fahrenheit");
    }
    @Override
    public double convertFromCelsius(double value) {
        value = value*1.8+32;
        return value;
    }
}

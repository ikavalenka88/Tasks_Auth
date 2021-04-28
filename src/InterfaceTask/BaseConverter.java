package InterfaceTask;

public class BaseConverter implements Converter {
    double value = degreeCelsius();
    static int degreeCelsius () {
        int degree = (int)(Math.random() * (40 + 1)) - 20;
        return degree;
    }

    double converterF = Converter.dergreeFahrenheit(value);
    double converterK = Converter.dergreeKelvin(value);
    double converterR = Converter.dergreeReaumur(value);

}

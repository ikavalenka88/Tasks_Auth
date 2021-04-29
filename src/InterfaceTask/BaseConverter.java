package InterfaceTask;

public class BaseConverter implements Converter {
    public static int degreeCelsius () {
        int degree = (int)(Math.random() * (40 + 1)) - 20;
        return degree;
    }
    //double value = degreeCelsius();
    @Override
    public void dergreeFahrenheit(double value) {
        value = value*1.8+32;
        printResultDouble(value);
    }
    @Override
    public void  dergreeKelvin(double value){
        value += 273.15;
        printResultDouble( value);
    }
    @Override
    public void dergreeReaumur(double value) {
        value+=218.52;
        printResultDouble(value);
    }

//    @Override
//    public void printResultInt() {
//        System.out.println("The value of Degree: ");
//    }

    @Override
    public void printResultDouble(double value) {
        System.out.println("The value of Degree: " + value);
    }

    @Override
    public void printResultDouble() {
        int value = degreeCelsius();
        System.out.println("The value of Degree: " + value);

    }
}

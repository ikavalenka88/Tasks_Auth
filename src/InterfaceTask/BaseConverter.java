package InterfaceTask;

public abstract class BaseConverter implements Converter,Print {
    String DergeeValue;

    public BaseConverter(String dergeeValue) {
        DergeeValue = dergeeValue;
    }

        public static int degreeCelsius () {
        int degree = (int)(Math.random() * (40 + 1)) - 20;
        return degree;
    }

    @Override
    public void print(double value) {
        System.out.println("The value of Degree: "+ value + DergeeValue);
    }
    //double value = degreeCelsius();
//    @Override
//    public void dergreeFahrenheit(double value) {
//        value = value*1.8+32;
//        printResultFahrenheit(value);
//    }
//    @Override
//    public void  dergreeKelvin(double value){
//        value += 273.15;
//        printResultKelvin( value);
//    }
//    @Override
//    public void dergreeReaumur(double value) {
//        value+=218.52;
//        printResultReaumur(value);
//    }

//    @Override
//    public void printResultInt() {
//        System.out.println("The value of Degree: ");
//    }


//    @Override
//    public void printResultFahrenheit(double value) {
//        System.out.println("The value of Degree: " + value + " Fahrenheit");
//    }
//
//    @Override
//    public void printResultKelvin(double value) {
//        System.out.println("The value of Degree: " + value + " Kelvin");
//    }
//    @Override
//    public void printResultReaumur(double value) {
//        System.out.println("The value of Degree: " + value + " Reaumur");
//    }
}

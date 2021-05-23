package InterfaceTask.util;

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
}

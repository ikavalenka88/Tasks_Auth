package InterfaceTask;

import static InterfaceTask.BaseConverter.*;

public class Main {
    public static void main(String[] args) {
        BaseConverter objOne =new BaseConverter();
        int value = degreeCelsius();
        System.out.println("The value of Degree:"+ value + " Celsius");
        objOne.dergreeFahrenheit(value);
        objOne.dergreeKelvin(value);
        objOne.dergreeReaumur(value);

//        degreeCelsius();
//        BaseConverter.printResult(degreeCelsius());
    }
}

package InterfaceTask;

interface Converter extends Print {
    void dergreeFahrenheit(double value);
    void dergreeKelvin(double value);
    void dergreeReaumur(double value);
//   static double dergreeFahrenheit(double value){
//        value = value*1.8+32;
//        return  value;
//    }
//    static double dergreeKelvin(double value){
//        value += 273.15;
//        return value;
//    }
//     static double dergreeReaumur(double value){
//        value+=218.52;
//        return value;
//    }

//    default void printResult() {}

    default void printResultDouble(double value) {}

//    default void printResultInt(int value) {}
}

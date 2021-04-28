package InterfaceTask;

interface Converter extends Print{

    static int degreeCelsius () {
        int degree = (int)(Math.random() * (40 + 1)) - 20;
        return degree;
    }
   static double dergreeFahrenheit(double value){
        value = value*1.8+32;
        return  value;
    }
    static double dergreeKelvin(double value){
        value += 273.15;
        return value;
    }
     static double dergreeReaumur(double value){
        value+=218.52;
        return value;
    }
}

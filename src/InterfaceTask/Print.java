package InterfaceTask;

interface Print {
   default void printResult(int value) {
        System.out.println("The value of Degree: " + value);
    }
    default void printResult(double value) {
        System.out.println("The value of Degree: " + value);
    }
    default void printResult() {
        System.out.println("The value of Degree: ");
    }
}

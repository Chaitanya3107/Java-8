package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterface = () -> System.out.println("Hello");
        functionalInterface.sayHello();
        functionalInterface.sayBye();
        FunctionalInterfaceExample.greet();
    }
}

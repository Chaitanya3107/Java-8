package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterface = () -> System.out.println("Hello");
        functionalInterface.sayHello();
        functionalInterface.sayBye();
        FunctionalInterfaceExample.greet();
        // Using lambda expression
        Runnable runnable = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Number is " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

package LambdaExpression;
@java.lang.FunctionalInterface
public interface FunctionalInterfaceExample {
    public void sayHello();
    default void sayBye(){
        System.out.println("Bye");
    }
    public static void greet(){
        System.out.println("Greetings");
    }
}

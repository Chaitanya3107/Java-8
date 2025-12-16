package StaticMethods;

public interface A {
    static void greet(){
        System.out.println("Greet from A");
    }
    default void sayHello(){
        System.out.println("Hello");
    }
}

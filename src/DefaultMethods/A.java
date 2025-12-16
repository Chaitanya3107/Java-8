package DefaultMethods;

public interface A {
    default void greet(){
        System.out.println("Greet from A");
    }
}

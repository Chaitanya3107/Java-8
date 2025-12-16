package DefaultMethods;

public interface B {
    default void greet(){
        System.out.println("Greet from B");
    }
}

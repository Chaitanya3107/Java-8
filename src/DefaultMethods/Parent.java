package DefaultMethods;

public interface Parent {
    default void greet(){
        System.out.println("Greetings from parents");
    }
}

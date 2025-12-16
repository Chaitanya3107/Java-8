package DefaultMethods;

public class Child implements Parent{
    @Override
    public void greet() {
        System.out.println("Greetings from child");
    }
}

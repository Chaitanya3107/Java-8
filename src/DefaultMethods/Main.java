package DefaultMethods;


public class Main implements A, B{
    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
    }

    @Override
    public void greet() {
        A.super.greet();
        B.super.greet();
        System.out.println("Greet from Main");
    }
}

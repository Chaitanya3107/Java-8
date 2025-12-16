package Example;

public class Main {
    public static void main(String[] args) {
        Employee be = () -> "Backend Engineer"; // now we don't need separate class, we can use lambda expression
        Employee fe = () -> "Frontend Engineer"; // now we don't need separate class, we can use lambda expression
        System.out.println(be.getName());
        System.out.println(fe.getName());

    }
}

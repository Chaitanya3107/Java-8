package StaticMethods;


public class Main implements A{
    public static void main(String[] args) {
        A.greet();
        Main m = new Main();
        m.sayHello();
    }

}

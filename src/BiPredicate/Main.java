package BiPredicate;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String,Integer> biPredicate = (s,x) -> s.length() == x;
        System.out.println(biPredicate.test("Hello",6));

        BiFunction<String,String,Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("hello","world"));

        BiConsumer<String,Integer> biConsumer = (s,x) -> System.out.println(s + " " + x);
        biConsumer.accept("Hello",6);


    }

}

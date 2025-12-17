package Supplier;

import javax.management.InstanceNotFoundException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> 1;

        System.out.println(supplier1.get());

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x * x;
        Consumer<Integer> consumer = System.out::println;
        Supplier<Integer> supplier = () -> 10;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


    }
}

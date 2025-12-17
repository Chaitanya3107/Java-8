package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println; // method reference
        consumer.accept("Max");
        Consumer<List<Integer>> listConsumer1 = list -> {
            for(Integer i : list){
                System.out.print(i + 100);
                System.out.print(" ");
            }
            System.out.println();
        };
        Consumer<List<Integer>> listConsumer2 = list -> {
            for(Integer i : list){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        };
        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4,5));
    }
}

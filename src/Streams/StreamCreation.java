package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "mango", "grapes");
        Stream<String> stream = list.stream();

        String[] arr = {"apple", "banana", "mango", "grapes"};
        List<String> list1 = Arrays.stream(arr).toList();
        System.out.println(list1);
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        Stream<Integer> limit = Stream.iterate(10, x -> x + 1).limit(101);
        for (Integer i : limit.toList()) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        Stream<Integer> limit1 = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        for(Integer i : limit1.toList()){
            System.out.print(i);
            System.out.print(" ");
        }


    }
}

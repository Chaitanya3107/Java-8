package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,24,4,3,5,465,2,165,44,865,313,46,51,1,23,56,4,88,44,33,24,4,2);
//        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).toList();
        // Filter
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        // Map
        List<Integer> mappedList = filteredList.stream().map( x -> x / 2).toList();
        System.out.println(mappedList);

        List<Integer> list1 = Arrays.asList(1,24,4,3,5,465,2,165,44,865,313,46,51,1,23,56,4,88,44,33);
//        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).map(x -> x/2).toList();
        System.out.println(list2);

        // Distinct
        List<Integer> distinctList = list1.stream().filter(x -> x % 2 == 0).map(x -> x/2).distinct().toList();
        System.out.println(distinctList);

        // Sorted ascending
        List<Integer> sortedList = list1.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted()
                .toList();
        System.out.println("Sorted list ascending list: " + sortedList);

        // Sorted Descending order using comparator
        List<Integer> descendingSortedList = list1.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((x,y)-> y-x)
                .toList();
        System.out.println("Descending list: " + descendingSortedList);

        // Limit and Skip
        List<Integer> limitSkipSortedList = list1.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((x,y)-> y-x).limit(4).skip(2)
                .toList();
        System.out.println("Limited and Skipped list: " + limitSkipSortedList);

        // peak
        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter( x -> x % 2 == 0)
                .map( x -> x / 10 )
                .distinct()
                .peek(x -> System.out.print(x + " ")) // takes consumer and perform some operation
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(collect);

        // max
        Integer max = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map( x -> x / 10 )
                .distinct()
                .peek(x -> System.out.print(x + " "))
                .max( (x,y) -> x-y)
                .get();
        System.out.println();
        System.out.println("Max element is list is " + max);

        // min
        Integer min = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map( x -> x / 10 )
                .distinct()
                .peek(x -> System.out.print(x + " "))
                .min( (x,y) -> x-y)
                .get();
        System.out.println();
        System.out.println("Min element is list is " + min);

        // count
        long count = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map( x -> x / 10 )
                .distinct()
                .peek(x -> System.out.print(x + " "))
                .skip(1)
                .count();
        System.out.println();
        System.out.println("Total elements in list is " + count);

    }
}

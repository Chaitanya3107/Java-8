package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(35);
        list.add(1);
        list.add(56);
        list.add(15);
        list.add(24);
        System.out.println(list);
//        Collections.sort(list);
//        Collections.sort(list,new MyClass()); // using comparator
        Collections.sort(list,(a,b) -> b-a ); // using lambda expression
        System.out.println(list);
    }
}

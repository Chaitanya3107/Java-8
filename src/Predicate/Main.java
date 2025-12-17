package Predicate;

import Example.SoftwareEngineer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> salaryGreaterThanOneLac = x -> x > 100000;  // this will compare input salary with 1 lac and return true or false
        System.out.println(salaryGreaterThanOneLac.test(1));
        System.out.println(salaryGreaterThanOneLac.test(1000000));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println("Sum of list is  " + sum);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven = x -> x % 2 == 0;
        for(Integer i : list){
            if(isEven.test(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
        Predicate<String> startsWithA = s -> s.toLowerCase().charAt(0) == 'h';
        System.out.println(startsWithA.test("Arnold"));
        System.out.println(startsWithA.test("Hello"));

        Predicate<String> endsWithA = s -> s.toLowerCase().charAt(s.length()-1) == 'k';
        // now combining two predicates for new condition
        System.out.println("Testing and function in Predicate");
        Predicate<String> and = startsWithA.and(endsWithA);
        System.out.println(and.test("Hulk"));
        System.out.println(and.test("Bye"));
        Predicate<String> or = startsWithA.or(endsWithA);
        System.out.println("Testing or function in Predicate");
        System.out.println(or.test("Walk"));
        System.out.println("Testing negate function in Predicate");
        System.out.println(startsWithA.negate().test("Harry")); // will reverse the condition of original predicate

        Student s1 = new Student(1,"Max");
        Student s2 = new Student(20,"Rex");
        Predicate<Student> studentPredicate = s -> s.getId() > 10;
        System.out.println(studentPredicate.test(s1));
        System.out.println(studentPredicate.test(s2));


        Predicate<Object> isEqual = Predicate.isEqual("Max");
        System.out.println(isEqual.test("Rex"));
        System.out.println(isEqual.test("Max"));
    }

    private static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}







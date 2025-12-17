package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> function1 = x -> x.length();
        System.out.println(function1.apply("Program"));

        Function<String,String> function2 = s -> s.substring(0,3);
        System.out.println(function2.apply("Program"));

        Predicate<Integer> CompareMarks = x -> x >= 70;
        Function<List<Student>, List<Student>> studentsWithMarksGreaterThan70 = li -> {
            List<Student> newStudents = new ArrayList<>();
            for(Student s : li){
                if(CompareMarks.test(s.getMarks())){
                    newStudents.add(s);
                }
            }
            return newStudents;
        };
        Random random = new Random();
        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<10;i++){
            int marks = 50 + random.nextInt(40);
//            int marks = 50 + (int) (Math.random() * 40);
            char name = (char) ('A' + random.nextInt(26));
            studentList.add(new Student(marks,name));
        }
        System.out.println("Original list of students with their marks");
        System.out.println(studentList);
        System.out.println("Filtered list of students with marks greater than 70");
        List<Student> filteredStudents = studentsWithMarksGreaterThan70.apply(studentList);
        System.out.println(filteredStudents);

    }

    private static class Student{
        private int marks;

        @Override
        public String toString() {
            return "Student{" +
                    "marks=" + marks +
                    ", name='" + name + '\'' +
                    '}';
        }

        private char name;

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public char getName() {
            return name;
        }

        public void setName(char name) {
            this.name = name;
        }

        public Student(int marks, char name) {
            this.marks = marks;
            this.name = name;
        }
    }
}

package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class MyClass {
    public static void main(String[] args) {
        Student s1 = new Student(20,"Max");
        Student s2 = new Student(22,"Rex");
        Student s3 = new Student(18,"Drax");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        Collections.sort(studentList, (a,b) -> b.age-a.age); // sorting in descending order wrt to their id
        System.out.println(studentList);

    }
}

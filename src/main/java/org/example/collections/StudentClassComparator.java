package org.example.collections;

import java.util.*;


class Student implements Comparable {

    int id;
    String name;
    int marks;



    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class StudentClassComparator {

    public static void main(String[] args) {


        Comparator comp = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if(i.marks>j.marks)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> stud = new ArrayList<Student>();

        stud.add(new Student(1, "Mirza", 90));
        stud.add(new Student(2, "Umair", 80));
        stud.add(new Student(3, "Ali", 70));
        stud.add(new Student(4, "Ahmed", 60));


        System.out.println();





    }
}

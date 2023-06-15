//package org.example._2023_05_30;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import java.io.Serializable;
//import java.util.Comparator;
//import java.util.Random;
//
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//public class Person implements Comparable<Person>, Serializable {
//    private String name;
//    private Integer age;
//    private int salary;
//
//    @Override
//    //p1==this.      compareTo(    p2  )
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }
//}
//
//class SalaryComparator implements Comparator<Person> {
//
//    @Override
//    //compare(p1, p2)
//    public int compare(Person o1, Person o2) {
//        return o1.getSalary() - o2.getSalary();
//    }
//}
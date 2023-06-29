package org.example._2023_06_29;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example._2023_06_27.streamAPI.Str;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mik", 2222);
        Employee e2 = new Employee("Anna", 2772);

        List<Employee> list1 = new ArrayList<>();
        list1.add(e1);

        List<Employee> list2 = new ArrayList<>();
        list2.add(e2);

        Department d1 = new Department("It", list1);
        Department d2 = new Department("HR", list2);

        List<Department> dlist1 = new ArrayList<>();
        dlist1.add(d1);
        dlist1.add(d2);

        Company company = new Company("TYU", dlist1);
    }
}

@Getter
@AllArgsConstructor
class Company {
    private String name;
    private List<Department> departmetnList;
}

@Getter
@AllArgsConstructor
class Department {
    private String name;
    private List<Employee> employees;
}
@Getter
@AllArgsConstructor
class Employee {
    private String name;
    private double salary;
}
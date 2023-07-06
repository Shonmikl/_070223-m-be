package org.example._2023_07_06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//collect // Collectors // groupingBy()
public class StreamEx3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 5000),
                new Employee("Alice", "Smith", 6000),
                new Employee("Bob", "Johnson", 4000),
                new Employee("Jane", "Williams", 5500),
                new Employee("Michael", "Brown", 7000)
        );

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(employee -> {
                    if (employee.getSalary() < 5000) {
                        return "Low";
                    } else if (employee.getSalary() < 6000) {
                        return "Medium";
                    } else {
                        return "High";
                    }
                }));
        System.out.println(" groupingBy() :");
        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        List<String> name = employees.stream().map(Employee::getFirstName).collect(Collectors.toList());
        System.out.println(name);
    }

    @Getter
    @AllArgsConstructor
    @ToString
    static class Employee {
        private String firstName;
        private String lastName;
        private int salary;
    }
}

package org.example._2023_08_01;

import lombok.AllArgsConstructor;

public class Re8 {
    static void getEmpInfo(Employee e) {
        System.out.printf("ID: %03d \t NAME: %-12s \t %-12s \t %,.1f \n"
                , e.id, e.name, e.surname, e.salary * (1 + e.bonusPCT));
    }

    public static void main(String[] args) {
        Employee e1
                = new Employee(1, "Ivan", "Ivanov", 2500, 0.12);
        getEmpInfo(e1);
    }
}

@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPCT;
}
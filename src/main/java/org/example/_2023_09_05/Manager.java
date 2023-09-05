package org.example._2023_09_05;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    public int id;
    public String name;
    public String department;
    private double salary = 9999;

    public Manager(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private void changeDepartment(String newDep) {
        department = newDep;
        System.out.println("NEW DEP: " + department);
    }

    public void  increaseSalary() {
        salary *= 1.25;
    }
}
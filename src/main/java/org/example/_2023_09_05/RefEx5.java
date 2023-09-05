package org.example._2023_09_05;

import java.lang.reflect.Field;

public class RefEx5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Manager manager = new Manager(1, "Nik", "IT");
        Class managerClass = manager.getClass();
        Field field = managerClass.getDeclaredField("salary");

        field.setAccessible(true);

        double salaryValue = (double) field.get(manager);
        System.out.println("SALARY: " + salaryValue);

        field.set(manager, 7777);
        System.out.println(manager);
    }
}
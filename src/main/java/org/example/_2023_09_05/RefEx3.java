package org.example._2023_09_05;

import java.lang.reflect.Constructor;

public class RefEx3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class managerClass = Class.forName("org.example._2023_09_05.Manager");

        Constructor constructor = managerClass.getConstructor();
        System.out.println("HAS: " + constructor.getParameterCount());
        System.out.println("-------------------------------------------");

        Constructor[] constructors = managerClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("NAME: " + c.getName() + " PARAM COUNT: " +  c.getParameterCount() + " PARAM TYPE: " + c.getParameterTypes());
        }
    }
}

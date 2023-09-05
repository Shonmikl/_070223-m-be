package org.example._2023_09_05;

import java.lang.reflect.Method;
import java.util.Arrays;

public class RefEx2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class managerClass = Class.forName("org.example._2023_09_05.Manager");
        Method method = managerClass.getMethod("increaseSalary");
        System.out.println("RETURN TYPE: " + method.getName() + " : " +  method.getReturnType());
        System.out.println("-------------------------------------------");

        Method method1 = managerClass.getMethod("setSalary", double.class);
        System.out.println("RETURN TYPE: " + method1.getName() + " : " +  method1.getReturnType());
        System.out.println(Arrays.toString(method1.getParameterTypes()));
        System.out.println("-------------------------------------------");

        Method[] methods = managerClass.getMethods();
        for (Method m : methods) {
            System.out.println("NAME: " + m.getName() + " : RETURN TYPE: " +  m.getReturnType() + " PARAM TYPE: " + m.getParameterTypes());
        }
    }
}

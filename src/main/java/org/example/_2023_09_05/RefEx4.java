package org.example._2023_09_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefEx4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class managerClass = Class.forName("org.example._2023_09_05.Manager");
//        Class<Manager> managerClass1 = Manager.class;
//        System.out.println(managerClass1);
//
//        System.out.println(managerClass1 == managerClass);

        Constructor constructor = managerClass.getConstructor();
        Manager obj = (Manager) constructor.newInstance();

        Method method = managerClass.getMethod("setSalary", double.class);
        method.invoke(obj, 800.00);
        System.out.println(obj);
    }
}

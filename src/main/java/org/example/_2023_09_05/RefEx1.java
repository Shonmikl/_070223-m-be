package org.example._2023_09_05;

import java.lang.reflect.Field;

public class RefEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class managerClass = Class.forName("org.example._2023_09_05.Manager");
        Field field = managerClass.getField("id");
        System.out.println("Field type: " + field.getType());
        System.out.println("--------------------------------------");

        Field[] fields = managerClass.getFields();
        for (Field f : fields) {
            System.out.println("Field name: " + f.getName() + " | Field type: " + f.getType());
        }
        System.out.println("--------------------------------------");

        Field[] withPrivateFields = managerClass.getDeclaredFields();
        for (Field f : withPrivateFields) {
            System.out.println("!P! Field name: " + f.getName() + " | Field type: " + f.getType());
        }
        System.out.println("--------------------------------------");
    }
}

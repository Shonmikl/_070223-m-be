package org.example._2023_07_11.serial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.example._2023_06_27.streamAPI.Str;

import java.io.*;

@Getter
@ToString
@AllArgsConstructor
public class MyClass implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient Double salary;
}

class SerialExample {

    public static void serializeObject(String fileName, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Object was serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deSerializeObject(String fileName) {
        Object obj;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = in.readObject();

            in.close();
            fileIn.close();
            System.out.println("Object was deserialized");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}

class SER {
    public static void main(String[] args) {
        //ser
        MyClass obj = new MyClass("John", 25, 9999d);
        SerialExample.serializeObject("obj.ser", obj);
    }
}

class DESER {
    public static void main(String[] args) {
        //deser
        MyClass deserObj = (MyClass) SerialExample.deSerializeObject("obj.ser");
        System.out.println();
        System.out.println("Name: " + deserObj.getName());
        System.out.println("Age: " + deserObj.getAge());
        System.out.println("Salary: " + deserObj.getSalary());
    }
}
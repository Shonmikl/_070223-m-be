package org.example._2023_07_11.serial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.*;

@Getter
@ToString
@AllArgsConstructor
public class Person1 implements Serializable {
    private String name;
    private int age;
}

class SerialExample1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("John", 22);
        System.out.println("Before serial: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        //serial
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person1);
            out.close();
            fileOut.close();
            System.out.println("Object was serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person1 person11 = new Person1("Test", 22);
        System.out.println("[" + person11 + "]");

        //de serial
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person11 = (Person1) in.readObject();
            System.out.println(person11 == person1);
            in.close();
            fileIn.close();
            System.out.println("Object was deserialized");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //check the condition
        if (person1 != null) {
            System.out.println("After deserial: ");
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
        }
    }
}
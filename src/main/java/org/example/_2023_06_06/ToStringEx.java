package org.example._2023_06_06;

public class ToStringEx {
    String name;
    int age;

//    @Override
//    public String toString() {
//        return "Class --> " + "NAME: [ " + name + " ] ||| AGE: [ " + age + " ]";
//    }

    public static void main(String[] args) {
        ToStringEx toStringEx = new ToStringEx();
        toStringEx.age = 25;
        toStringEx.name = "John";
        System.out.println(toStringEx);

        toStringEx.toString();
    }
}

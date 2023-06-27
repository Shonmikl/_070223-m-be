package org.example._2023_06_27.lamb;

public class Test95 {
    public static void main(String[] args) {
        m2(Test95::getRef);
    }

    public static void getRef() {
        System.out.println("***");
        System.out.println("&&&");
    }

    public static void m2(Term term) {
        System.out.println("*****");
        term.get();
    }
}

@FunctionalInterface
interface Term {
    void get();
}
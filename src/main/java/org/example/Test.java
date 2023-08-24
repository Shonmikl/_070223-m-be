package org.example;

public class Test {
    public int dev(int a, int b) throws ArithmeticException{
        return a / b;
    }
}

class Test2 {
    public static void main(String[] args) {
        new Test().dev(5, 5);
    }
}
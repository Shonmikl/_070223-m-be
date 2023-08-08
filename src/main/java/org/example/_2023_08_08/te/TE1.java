package org.example._2023_08_08.te;

public class TE1 {

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getDivide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}
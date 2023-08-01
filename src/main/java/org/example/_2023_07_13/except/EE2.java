package org.example._2023_07_13.except;

public class EE2 {
    /**
     * @param a first digit
     * @param b second digit
     * @return divide of 'a' and 'b'
     * @throws ArithmeticException if b == 0;
     */
    public int dev(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}

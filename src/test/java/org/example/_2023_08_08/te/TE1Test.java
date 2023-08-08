package org.example._2023_08_08.te;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TE1Test {
    private static final TE1 te = new TE1();
    private static final int A = 10;
    private static final int B = 5;

    @Test
    void getSumTest() {
        Assertions.assertEquals(11, te.getSum(A, B));
    }

    @Test
    void getDividePositiveTest() {
        Assertions.assertEquals(2, te.getDivide(A, B));
    }

    @Test
    void getDivideExceptionByZeroTest() {
        int c = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> te.getDivide(A, c));
    }
}
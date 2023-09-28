package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Test {

    private static void test(String... s) {

    }
    public static void main(String[] args) {
        Test test = new Test();
    }
}

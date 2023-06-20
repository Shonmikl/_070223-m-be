package org.example._2023_06_20.col;

import java.util.Stack;

public class STACKEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("E");
        stack.push("Q");
        stack.push("I");
        stack.push("P");
        stack.push("M");
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
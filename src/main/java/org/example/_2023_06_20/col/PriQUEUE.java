package org.example._2023_06_20.col;

import java.util.PriorityQueue;

public class PriQUEUE {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(898);
        queue.add(941);
        queue.add(188);
        queue.add(114);
        queue.add(125);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue);
    }
}

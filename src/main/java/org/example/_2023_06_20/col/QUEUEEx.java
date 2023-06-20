package org.example._2023_06_20.col;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUEEx {
    //fifo
    //6 5 4 3 2 1
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("W");
        queue.add("A");
        queue.add("F");
        queue.add("T");
        queue.add("U");

        System.out.println(queue);
        //1 2 3 4 5 6
        //queue.offer()
        queue.peek();
        queue.poll();
        queue.remove();
    }
}

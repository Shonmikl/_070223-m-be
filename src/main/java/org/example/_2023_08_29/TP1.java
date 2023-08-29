package org.example._2023_08_29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new ERun());
        }

        executorService.shutdown();
        boolean at = executorService.awaitTermination(4, TimeUnit.SECONDS); //true

        System.out.println("MAIN END: " + at);
    }
}

class ERun implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "===START");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "===END");
    }
}
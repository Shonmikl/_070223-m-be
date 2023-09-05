package org.example._2023_31_08;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Emp("Paul", semaphore);
        new Emp("Dima", semaphore);
        new Emp("Mariya", semaphore);
        new Emp("Lera", semaphore);
        new Emp("Oxana", semaphore);
        new Emp("Vitalii", semaphore);
        new Emp("Vadim", semaphore);
        new Emp("Zarina", semaphore);
        new Emp("Elena", semaphore);
        new Emp("Roman", semaphore);
    }
}

class Emp extends Thread {
    String name;
    private Semaphore semaphore;

    public Emp(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.setName("THREAD---" + name);
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " before....||||| " + Thread.currentThread().getName());
            semaphore.acquire();

            Thread.sleep(3333);
            System.out.println(name + " after....||||| " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
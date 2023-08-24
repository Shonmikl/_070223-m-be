//package org.example._2023_08_24.part2;
//
//public class Main {
//    public static void main(String[] args) {
//        Warehouse warehouse = new Warehouse(10);
//
//        Thread producerThread = new Thread(new Producer(warehouse));
//        Thread consumerThread = new Thread(new Consumer(warehouse));
//
//        producerThread.start();
//        consumerThread.start();
//    }
//}
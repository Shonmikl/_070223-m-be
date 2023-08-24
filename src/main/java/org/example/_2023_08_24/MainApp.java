package org.example._2023_08_24;

class Sender {
    private volatile int dataToSend;

    public void sendData(int data) {
        dataToSend = data;
        System.out.println("Sending data: " + data);
    }

    public int getDataToSend() {
        return dataToSend;
    }
}

class Receiver {
    private volatile int receivedData;

    public synchronized void receiveData(int data) {
        receivedData = data;
        System.out.println("Received data: " + data);
    }

    public synchronized int getReceivedData() {
        return receivedData;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Thread senderThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
            }
        });

        Thread receiverThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
            }
        });

        Thread mainThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                int data = receiver.getReceivedData();
                System.out.println("Main thread received data: " + data);
            }
        });

        senderThread.start();
        receiverThread.start();
        mainThread.start();
    }
}
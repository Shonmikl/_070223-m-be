package org.example._2023_09_28.proxy.ex;

public interface Car {
   void start();
   void stop();
}

class RealCar implements Car {
    @Override
    public void start() {
        System.out.println("Real Car start.");
    }

    @Override
    public void stop() {
        System.out.println("Real Car STOP!");
    }
}

class ProxyCar implements Car {
    private final Car realCar;

    public ProxyCar(Car realCar) {
        this.realCar = realCar;
    }

    @Override
    public void start() {
        System.out.println("Logging start.");
        realCar.start();
    }

    @Override
    public void stop() {
        System.out.println("Logging stop.");
        realCar.stop();
    }
}

class Main {
    public static void main(String[] args) {
        Car realCar = new RealCar();
        Car proxyCar = new ProxyCar(realCar);

        proxyCar.start();
        proxyCar.stop();
    }
}
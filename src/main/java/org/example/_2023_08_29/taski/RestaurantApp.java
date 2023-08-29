package org.example._2023_08_29.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Getter
@AllArgsConstructor
class Dish {
    private String name;

    private long preparationTime; // in milliseconds

}

@Getter
@AllArgsConstructor
class Order {
    private String id;
    private List<Dish> dishes;

    @Setter
    private String status;

    public void addDish(Dish dish) {
        ///??????
    }
}

class Kitchen {
    private ExecutorService chefThreadPool;

    public Kitchen(int chefCount) {
        ///??????
    }

    public void cookDish(Dish dish) {
        //??????
    }

    public void shutdown() {
        ///??????
    }
}

class OrderProcessor {
    private Kitchen kitchen;

    public OrderProcessor(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void processOrder(Order order) {
        ///??????
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        ///??????
    }
}
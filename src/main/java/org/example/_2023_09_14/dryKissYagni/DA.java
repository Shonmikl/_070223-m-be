package org.example._2023_09_14.dryKissYagni;

import java.util.List;

public class DA {
    public void processData(List<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        double average = (double) sum / data.size();
        System.out.println("Average: " + average);
    }

    public void processUserData(List<User> users) {
        int totalAge = 0;
        for (User user : users) {
            //totalAge += user.getAge();
        }
        System.out.println("Total Age: " + totalAge);

        double averageAge = (double) totalAge / users.size();
        System.out.println("Average Age: " + averageAge);
    }
}
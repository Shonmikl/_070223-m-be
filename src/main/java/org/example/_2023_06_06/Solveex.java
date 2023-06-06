package org.example._2023_06_06;

import java.util.List;

public class Solveex {
    /**
     * 1. Создаем лист
     * 2. Заполняем лист стрингами
     * 3. Перебор циклом
     * 4. Проверка каждого слова
     * 5. Если тру, то вывод на экран
     */

    private static void ex(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if(checkPal(list.get(i))) {
                System.out.println(list.get(i));
            }
        }
    }

    private static boolean checkPal(String s) {
        return false;
    }

    private static void checker(String a, String b) {

    }


    public static void main(String[] args) {

    }
}

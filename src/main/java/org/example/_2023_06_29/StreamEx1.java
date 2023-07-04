package org.example._2023_06_29;

import java.util.*;
import java.util.stream.Collectors;

/**
 * - создаете стрим
 *
 * - разбиваете задание на действия
 * - находите соответствующий метод
 * - смотрите какой у него ФИ
 * - смотрите на сигнатуру абстрактного метода
 *      - смотрите перегружен ли он или нет
 * - пишите реализацию
 *
 * - собираете терминальным оператором
 */
public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //filter()
        List<Integer> list = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(list);
        System.out.println("********************************************");

        List<String> names = Arrays.asList("Dima", "Roman", "Vadim", "Evgeny", "Vladislav");
        //map()
        List<Integer> namesLength = names.stream()
                .map(v -> v.length())
                .toList();
        System.out.println(namesLength);
        System.out.println("********************************************");

        List<Integer> numbersW = Arrays.asList(1, 1, 1, 4, 5, 6);
        //distinct()
        List<Integer> list1 = numbersW.stream()
                .distinct()
                .toList();
        System.out.println(list1);
        System.out.println("********************************************");

        List<Integer> numbersQ = Arrays.asList(9, 1, 2, 8, 4, 3, 2, 5, 7, 6);
        //sorted()
        List<Integer> list2 = numbersQ.stream()
                .sorted()
                .toList();
        System.out.println(list2);
        System.out.println("********************************************");

        List<Integer> numbersWW = Arrays.asList(1, 1, 9, 4, 5, 6);
        //limit()
        List<Integer> numbersWWW = numbersWW.stream()
                .limit(3)
                .toList();
        System.out.println(numbersWWW);
        System.out.println("********************************************");

        List<Integer> numbersA = Arrays.asList(1, 1, 9, 4, 5, 6);
        //skip()
        List<Integer> numbersA1 = numbersA.stream()
                .skip(3)
                .toList();
        System.out.println(numbersA1);
        System.out.println("********************************************");

        List<String> namesR = Arrays.asList("Dima", "Roman", "Vadim", "Evgeny", "Vladislav");
        //forEach()
        namesR.stream().forEach(System.out::println);
        System.out.println("********************************************");

        List<Integer> numbersQQ = Arrays.asList(1, 1, 9, 4, 5, 6);
        //allMatch()
        boolean b = numbersQQ.stream()
                .allMatch(n -> n < 8);
        System.out.println(b);
        System.out.println("********************************************");

        List<Integer> numbersLL = Arrays.asList(1, 1, 9, 4, 5, 6);
        //anyMatch()
        boolean b1 = numbersQQ.stream()
                .anyMatch(n -> n < 8);
        System.out.println(b1);
        System.out.println("********************************************");

        List<Integer> numbersMM = Arrays.asList(1, 1, 9, 4, 5, 6);
        //noneMatch()
        boolean b11 = numbersQQ.stream()
                .noneMatch(n -> n < 0);
        System.out.println(b11);
        System.out.println("********************************************");

        List<Integer> find = Arrays.asList(1, 1, 9, 4, 5, 6);
        //findFirst()
        Optional<Integer> optional = find.stream()
                .findFirst();
        System.out.println(optional.orElse(-1));
        System.out.println("---------------------------------------");

        List<Integer> findQ = Arrays.asList(1, 1, 9, 4, 5, 6);
        //reduce()
        Optional<Integer> sum = findQ.stream()
                .reduce((el1, el2) -> el1 + el2);
        System.out.println(sum);
        System.out.println("********************************************");

        List<Integer> findQX = Arrays.asList(1, 1, 9, 4, 5, 6);
        //collect()
        Set<Integer> set = findQX.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("********************************************");

        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6),
                Arrays.asList(7,8));
        //flatMap()
        List<Integer> list3 = groups.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list3);
    }
}

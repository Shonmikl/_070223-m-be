package org.example._2023_06_01.param;

import java.util.ArrayList;
import java.util.List;

public class PMex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Q");
        list.add("QW");
        list.add("QE");

       // String s0 = Cl.getEl(list);
       // System.out.println(s0);
    }
}

class Cl<T> {
    public T getEl(List<T> list) {
        return list.get(0);
    }

    //? extends X
    //? super X
}
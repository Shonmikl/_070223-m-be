package org.example._2023_06_01.param;

import java.util.ArrayList;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        X x = new Y();
      //  List<Number> list = new ArrayList<Integer>();
    }
}

class X<T extends Number> {}
class Y extends X {}
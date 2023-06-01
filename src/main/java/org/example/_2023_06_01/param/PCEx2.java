package org.example._2023_06_01.param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

public class PCEx2 {
    public static void main(String[] args) {
        P<Integer, String> stringP = new P<>(1, "M");
        P<Integer, String> stringP1 = new P<>(2, "Q");
        P<Integer, String> stringP2 = new P<>(3, "W");

        System.out.println(stringP2);

    }
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class P<T1, T2> {
    private T1 t1;
    private T2 t2;
}
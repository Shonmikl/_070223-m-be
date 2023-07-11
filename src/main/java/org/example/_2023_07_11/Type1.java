package org.example._2023_07_11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example._2023_06_27.streamAPI.Str;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Type1 implements Comparable<Type1>, Serializable {

    private int a;
    private double b;

    @Override
    public int compareTo(Type1 o) {
        return 0;
    }
}

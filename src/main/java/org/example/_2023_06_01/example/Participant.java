package org.example._2023_06_01.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Participant {
    private String name;
    private int age;
}

class Adult extends Participant {
   public Adult(String name, int age) {
       super(name, age);
   }
}

class TeenAge extends Participant {
    public TeenAge(String name, int age) {
        super(name, age);
    }
}

      //?   extends E
class Pupil extends Participant {
    public Pupil(String name, int age) {
        super(name, age);
    }
}

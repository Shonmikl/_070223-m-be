package org.example._2023_06_20.enums;

public class Main {
    public static void main(String[] args) {
        Security s1 = new Security("Nik", Permission.A);
        Security s2 = new Security("Paul", Permission.B);
        Security s3 = new Security("Lena", Permission.D);
        Security s4 = new Security("Mike", Permission.A);
        Security s5 = new Security("Alex", Permission.C);

        Security[] securities = {s1, s2, s3, s4, s5};

        for (Security s : securities) {
            if(s.getPermissionLevel()== Permission.A) {
                System.out.println("***");
            }
        }
    }
}

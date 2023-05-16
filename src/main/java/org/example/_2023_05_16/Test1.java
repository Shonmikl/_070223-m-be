package org.example._2023_05_16;

public class Test1 {
    int a;

    public Test1(int a) {
        this.a = a;
    }

    private static int m() {
        return 0;
    }

    Test1 test1 = new Test1(5);
      int    f  =   22;


    public static void main(String[] args) {
//        String[] s = {"#", "!", "^", "**"};
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
        new Test1(4);
        int r = m();


        char c = 'a';
        c--;
        System.out.println(c);
//
//        Test1[] test1s = {new Test1(2), new Test1(4), new Test1(0)};
//        Arrays.sort(test1s);
//        System.out.println(Arrays.toString(test1s));
    }
}

interface Inter {
    void get();
}

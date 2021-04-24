package by.mikhailov.basic.branching;

/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class Branching2 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        a = 10;
        b = 8;
        c = 10;
        d = -11;

        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));

    }
}

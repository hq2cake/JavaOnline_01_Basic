package by.mikhailov.basic.cycle;

/**
 * Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
 * a(n) = 1/2(n) + 1 /3(n)
 */

public class Cycle5 {
    public static void main(String[] args) {
        double e;
        double a;
        double sum = 0;

        e = 0.1;

        System.out.print("a: ");
        for (int n = 1000; n > 1; n--) {
            a = 0;
            a = (1 / (Math.pow(2, n)) + (1 / (Math.pow(3, n))));

            if (Math.abs(a) >= e) {
                sum += a;
                System.out.print( a + " ");
            }

        }
        System.out.println();
        System.out.println(sum);

    }
}

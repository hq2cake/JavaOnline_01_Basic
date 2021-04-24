package by.mikhailov.basic.cycle;

/**
 * Найти сумму квадратов первых 100 чисел
 */
public class Cycle3 {
    public static void main(String[] args) {
        int sum ;

        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i*i;
        }

        System.out.println("Сумма квадратов первых 100 чисел = " + sum);
    }
}

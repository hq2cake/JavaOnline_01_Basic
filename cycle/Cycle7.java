package by.mikhailov.basic.cycle;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */

public class Cycle7 {
    public static void main(String[] args) {
        startProg();
    }

    public static void startProg() {
        int m;
        int n;

        System.out.println("Укажите промежуток , в котором хотите вывести все делители");
        System.out.println("Первое число");
        System.out.print(">>");

        m = pNum();

        System.out.println("Второе число");
        System.out.print(">>");

        n = pNum();

        checkCondition(m, n); // Проверка
        divisorNumber(m, n); //
    }

    public static int pNum() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Вы ввели не число");
            System.out.print(">>");
        }
        return scanner.nextInt();
    }

    public static void checkCondition(int m, int n) {
        if (m > n) {
            System.out.println("\n" + "Значение m=" + m + " > чем значение n=" + n);
            System.out.println("Введите значение заново" + "\n");
            startProg();
        } else if (m == n) {
            System.out.println("\n" + "Значение m=" + m + " == значению n=" + n);
            System.out.println("Введите значения заново" + "\n");
            startProg();
        }
    }

    public static void divisorNumber(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");

            for (int j = 1; j < n; j++) {

                if(i > 0 && i % j == 0 && j != 1 && j != i) {
                    System.out.print (j + " ");
                }

            }
            System.out.println();
        }

    }
}

package by.mikhailov.basic.cycle;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Cycle1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum;

        System.out.print(">>");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print(">>");
        }
        number = Math.abs(scanner.nextInt());

        sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }

        System.out.print("Sum " + sum);
    }
}

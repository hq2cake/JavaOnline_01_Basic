package by.mikhailov.basic.linear;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour;
        int min;
        int sec;

        int t;

        System.out.print(">>");
        while ( !scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        t = scanner.nextInt();

        hour = t / 3600;
        min = (t % 3600 ) / 60;
        sec = t % 60;

        System.out.printf("%02dч %02dмин %02dсек",hour,min,sec);
    }
}

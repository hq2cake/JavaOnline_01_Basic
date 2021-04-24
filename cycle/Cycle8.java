package by.mikhailov.basic.cycle;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 * 12345
 * 34567
 * 345
 */

public class Cycle8 {
    public static void main(String[] args) {
        int number1;
        int number2;

        number1 = 2131111112;
        number2 = 1113333312;

        int[] array1 = parser(number1);
        int[] array2 = parser(number2);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array1.length; j++) {

                if (i == array1[j]) {

                    for (int k = 0; k < array2.length; k++) {

                        if (i == array2[k]) {
                            System.out.print(i + " ");
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public static int[] parser(int num) {
        int a = num;
        int counter = 0;
        int digit = 0;

        while (a != 0) {
            a /= 10;
            counter++;
        }

        int mas[] = new int[counter];
        a = num;
        for (int i = 0; i < counter; i++) {
            digit = a % 10;
            a /= 10;
            mas[i] = digit;

        }
        return mas;
    }
}

package by.mikhailov.basic.cycle;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycle4 {
    public static void main(String[] args) {
        long product;
        long temp;

        product = 1;
        for (int i = 1; i <= 200; i++) {
            temp = product;

            product *= (i*i);

            if (product < temp) {
                System.out.println("Далее невозможно искать произведение, произведение найдено до числа " +
                        i + "\n" +  "Произведение квадратов равно: " + temp);
                break;
            }

            System.out.println(product);
        }
    }
}

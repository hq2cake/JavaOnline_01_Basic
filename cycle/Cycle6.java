package by.mikhailov.basic.cycle;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.(Таблицу ASCII)
 */
public class Cycle6 {
    public static void main(String[] args) {

        for (int i = 30; i <= 200; i++) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println();
    }
}

package by.mikhailov.basic.branching;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Branching4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int x = 3;
        int y = 10;
        int z = 7;

        if ((a >= x && b >= y)||(a >= y && b >= x)) {
            System.out.println("Кирпич пройдет в отверстие");

        }else if ((a >= x && b >= z)||(a >= z && b >= x)) {
            System.out.println("Кирпич пройдет в отверстие");

        }else if ((a >= y && b >= z)||(a >= z && b >= y)) {
            System.out.println("Кирпич пройдет в отверстие");

        }else {
            System.out.println("Кирпич не пройдет в отверстие");
        }
    }

}

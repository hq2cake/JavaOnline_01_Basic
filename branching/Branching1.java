package by.mikhailov.basic.branching;

/**
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Branching1 {
    public static void main(String[] args) {
        int angle1;
        int angle2;

        angle1 = 40;
        angle2 = 50;

        if (angle1 + angle2 >= 180) {
            System.out.println("Такого треугольника не существует");
        } else if (angle1 == 90 || angle2 == 90 || (180 - angle1 - angle2) == 90) {
            System.out.println("Треугольник существует и он прямоугольный");
        } else {
            System.out.println("Треугольник сущесвует, но он не прямоугольный");
        }

    }
}

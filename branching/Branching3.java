package by.mikhailov.basic.branching;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Branching3 {
    public static void main(String[] args) {

        int aX;
        int aY;

        int bX;
        int bY;

        int cX;
        int cY;

        aX = 1;
        aY = 5;

        bX = 2;
        bY = 2;

        cX = 3;
        cY = 3;

        if ((aX - cX) * (bY - cY) - (bX - cX) * (aY - cY) == 0) {
            System.out.println("Точки расположены на одной линии");
        } else {
            System.out.println("Не на одной прямой ");
        }

    }
}

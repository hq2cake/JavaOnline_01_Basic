package by.mikhailov.basic.linear;

/**
 * Для данной области составить линейную программу, которая печатает
 * true, если точка с координатами (x,y) принадлежит закрашенной области,
 *  и false - в противном случае.
 */

public class Task6 {
    public static void main(String[] args) {
        int x;
        int y;

        boolean isPointHere;

        x = -5;
        y = 5;

        isPointHere = (((x >= -4 && x <= 4) && (y >= -3 && y <= 0))
                || ((x >= -2 && x <= 2) && (y <= 4 && y >= 0)))? true : false;

        System.out.println(isPointHere);
    }
}

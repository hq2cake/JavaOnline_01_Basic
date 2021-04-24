package by.mikhailov.basic.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sinx + cosy) / (cosx − siny)  * tgxy
 */

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;

        x = 1;
        y = 1;

        double result;

        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println(result);
    }
}

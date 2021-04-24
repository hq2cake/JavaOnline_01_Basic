package by.mikhailov.basic.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (( b +  √(b(2) + 4ac)) / 2a )  -  a(3)c  + b(-2)
 */

public class Task2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double result;

        a = 1;
        b = 2;
        c = 3;

        double temp;

        temp = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        temp = temp /  (2 * a);
        result = temp - ((Math.pow(a, 3) * c) + Math.pow(b, -2));

        System.out.println(result);
    }
}

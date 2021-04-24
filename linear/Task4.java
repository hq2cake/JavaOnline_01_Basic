package by.mikhailov.basic.linear;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа
 */

public class Task4 {
    public static void main(String[] args) {

        double number;
        double newNumber;

        number = 123.321;

        newNumber = (number * 1000) % 1000 + (int)number / 1000.0;

        System.out.println(newNumber);
    }
}

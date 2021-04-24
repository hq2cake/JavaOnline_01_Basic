package by.mikhailov.basic.branching;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 * если x <=3 то  x(2)-3x+9 если x >3 то  1/(x(3)+6)
 */

public class Branching5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;

        System.out.print(">>");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.print(">>");
        }
        x = scanner.nextDouble();

        if(x <= 3) {
            System.out.print((Math.pow(x, 2)) - 3 * x + 9);
        } else {
            System.out.println(1/((Math.pow(x,3)) + 6));
        }
    }
}

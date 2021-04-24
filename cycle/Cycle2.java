package by.mikhailov.basic.cycle;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h;
 */
public class Cycle2 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;

        a = -10;
        b = 22.0;
        h = 1.5;

        for (double x = a; x <= b; x+=h) {
            if (x > 2) {
                System.out.println(x);
            } else if(x<=2){
                System.out.println(-x);
            }
        }

    }
}

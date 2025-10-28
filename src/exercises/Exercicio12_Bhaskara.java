package exercises;

import java.lang.Math;
import java.util.Scanner;


public class Exercicio12_Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);


        double a = sc.nextDouble();

        double b = sc.nextDouble();

        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if(delta == 0 || delta < 0.0){
            System.out.println("Impossível calcular!");

        }else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("valor de x1 é %.4f:", x1);
            System.out.printf("valor de x2 é %.4f", x2);
        }
        sc.close();
    }
}

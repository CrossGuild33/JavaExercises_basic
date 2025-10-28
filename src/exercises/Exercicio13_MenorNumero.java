package exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio13_MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        int menor = Math.min(num2, Math.min( num1, num3));
        System.out.println("O número maior é:" + menor);

        scanner.close();
    }
}

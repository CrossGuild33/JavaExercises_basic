package exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio9_MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        int maior = Math.max(num1, num2);
        System.out.println("O número maior é:" + maior);
        
    }
}

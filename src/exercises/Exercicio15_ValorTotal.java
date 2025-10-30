package exercises;

import java.util.Scanner;

public class Exercicio15_ValorTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peça 1:");
        int codPeca1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        double valor1 = valorPeca1 * numPecas1;

        System.out.println("Peça 2:");
        int codPeca2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        double valor2 = valorPeca2 * numPecas2;

        double valorTotal = valor1 + valor2;

        System.out.printf("O valor total das peças %d e %d é %.2f", codPeca1, codPeca2, valorTotal);

    }
}

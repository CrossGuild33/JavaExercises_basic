package exercises;

import java.util.Scanner;

public class Exercicio14_Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int hrsTrabalhadas = sc.nextInt();
        double hrsValor = sc.nextDouble();
        double salario = hrsValor * hrsTrabalhadas;
        System.out.printf("O funcionário número %d recebe %.2f", number, salario);

        sc.close();
    }
}

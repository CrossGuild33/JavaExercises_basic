package exercises;

import java.util.Scanner;

public class Exercicio3_HelloName {
    public static void main(String[] args) {
        //exercicio para imprimir nome usando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("nome:" + nome);

    }
}

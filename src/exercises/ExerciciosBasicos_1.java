package exercises;

import java.util.Scanner;

public class ExerciciosBasicos_1 {
    public static void main(String[] args) {
        // Aqui estarei realizando exercícios de imprimir estruturas diferentes de dados,
        // imprimir um nome em Scanner e o "Hello World!"

        //exercicio para imprimir int, double, char, String e boolean
        int numero = 20;
        double decimal = 10.5;
        char caractere = 'A';
        String palavra = "computador";
        boolean ifelse = true;

        //exercicio para imprimir nome usando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("nome:" + nome);

        //imprimindo Hello World!
        System.out.println("Hello World!");
        System.out.println(numero);
        System.out.println(decimal);
        System.out.println(caractere);
        System.out.println(palavra);
        System.out.println(ifelse);
    }
}

package exercises;

import java.util.Scanner;

public class Exercicio11_ClassificacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota:");
        int nota = scanner.nextInt();
        if(nota >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}

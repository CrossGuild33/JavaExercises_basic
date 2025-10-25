package exercises;

import java.util.Scanner;

public class Exercicio7_PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        if(num >= 0){
            System.out.println("O número informado é positivo");
        }else{
            System.out.printf("O número informado é negativo");
        }
    }
}

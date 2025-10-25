package exercises;

import java.util.Scanner;

public class ExerciciosBasicos_3 {
    public static void main(String[] args) {

        // exercício de for, para imprimir numeros de 1 a 10.
       for (int i = 1; i <= 10; i++){
           System.out.println(i);
       }

       // exercício For para imprimir numero com a tabuada de 1 a 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

        scanner.close();
        
    }
}

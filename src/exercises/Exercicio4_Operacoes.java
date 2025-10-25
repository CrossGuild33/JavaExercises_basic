package exercises;

import java.util.Scanner;

public class Exercicio4_Operacoes {
    public static void main(String[] args) {
        // Exercício de criar calculadora


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:" );
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo numero:" );
        double b = scanner.nextDouble();
        System.out.println("Escolha um operador(/, *, +, -):");
        char operator = scanner.next().charAt(0);


        double result;
        switch (operator){
            case '+':
                result = a + b;
                System.out.println("Resultado:" + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Resultado:" + result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Resultado" + result);
                } else{
                        System.out.println("Error: não é permitido divisão por zero");
                    }
                break;

            case '*':
                result = a * b;
                System.out.println("Resultado:" + result);
                break;

            default:
                System.out.println("Operador inválido");
        }

        scanner.close();

    }
}

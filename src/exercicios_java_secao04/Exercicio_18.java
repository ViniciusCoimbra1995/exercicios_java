package exercicios_java_secao04;

/*
Faça um programa java que mostre ao usuário um menu com 4 opções de operações matemáticas (adição, subtração, multiplicação e divisão).
O usuário escolhe uma das opções e o programa então pede dois valores números e realiza a operação, mostrando resultado e saindo.
 */
import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir o menu de operações
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        // Solicitar a escolha do usuário
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Solicitar os dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar a operação de acordo com a escolha do usuário
        double resultado;
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Exibir o menu de operações
        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma de 2 números");
        System.out.println("2. Diferença entre 2 números (maior pelo menor)");
        System.out.println("3. Produto entre 2 números");
        System.out.println("4. Divisão entre 2 números (o denominador não pode ser zero)");

        // Solicitar a escolha do usuário
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Variáveis para armazenar os números digitados
        double numero1, numero2;

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextDouble();
                System.out.println("Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextDouble();
                System.out.println("Diferença entre os números: " + Math.abs(numero1 - numero2));
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextDouble();
                System.out.println("Resultado do produto: " + (numero1 * numero2));
                break;
            case 4:
                System.out.print("Digite o numerador: ");
                numero1 = scanner.nextDouble();
                System.out.print("Digite o denominador: ");
                numero2 = scanner.nextDouble();
                if (numero2 != 0) {
                    System.out.println("Resultado da divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("O denominador não pode ser zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();

    }

}

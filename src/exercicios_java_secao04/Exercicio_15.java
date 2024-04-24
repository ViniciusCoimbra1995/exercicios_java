package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê um número inteiro entre 1 e 7
        System.out.println("Digite um número entre 1 e 7:");
        int numero = scanner.nextInt();

        // Utiliza a estrutura switch para imprimir o dia da semana correspondente ao número
        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
        }

        scanner.close();

    }
}

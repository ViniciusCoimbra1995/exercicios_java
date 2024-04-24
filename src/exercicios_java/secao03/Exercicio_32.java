package exercicios_java.secao03;

// Aqui está um exemplo de código Java que lê um número inteiro, calcula a soma do sucessor de seu triplo com o antecessor de seu dobro e imprime o resultado:

import java.util.Scanner;

public class Exercicio_32 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Cálculo da expressão
        int resultado = (numero * 3 + 1) + ((numero * 2 - 1));

        // Impressão do resultado
        System.out.println("A soma do sucessor de seu triplo com o antecessor de seu dobro é: " + resultado);

        scanner.close();
    }
}



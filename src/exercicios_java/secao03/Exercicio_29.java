package exercicios_java.secao03;

// Este programa solicita ao usuário que insira quatro notas, lê essas notas, calcula a média aritmética das notas e, em seguida, imprime o resultado da média.

import java.util.Scanner;

public class Exercicio_29 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a 1ª nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Insira a 2ª nota: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Insira a 3ª nota: ");
        double nota3 = teclado.nextDouble();

        System.out.println("Insira a 4ª nota: ");
        double nota4 = teclado.nextDouble();

        double calculaMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + calculaMedia);

        teclado.close();
    }
}

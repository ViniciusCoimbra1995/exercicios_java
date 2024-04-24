package exercicios_java.secao03;

//  lê três valores do usuário e calcula a soma dos quadrados desses valores

import java.util.Scanner;

public class Exercicio_28 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double valor1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = teclado.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = teclado.nextDouble();

        double somaQuadrado = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2);

        System.out.println("A soma dos quadrados é: " + somaQuadrado);

        teclado.close();

    }
}

package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = teclado.nextDouble();

        double raizQuadrada = Math.sqrt(numero);

        double numeroQuadrado = numero * numero;

        if (numero > 0) {
            System.out.println("A raiz quadrada do número " + numero + " é: " + raizQuadrada);
        } else {
            System.out.println("O número " + numero + " ao quadrado é: " + numeroQuadrado);

        }

        teclado.close();

    }
}

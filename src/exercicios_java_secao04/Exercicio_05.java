package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = teclado.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");

        }

        teclado.close();
    }
}

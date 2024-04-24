package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_34 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raioCirculo = teclado.nextDouble();

        double pi = 3.141592;
        double calculavalorRaio = pi * raioCirculo;

        System.out.println("A área do círculo é de: " + calculavalorRaio);

        teclado.close();

    }
}

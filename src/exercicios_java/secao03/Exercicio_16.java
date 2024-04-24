package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em centímetros: ");
        double valorCentimetros = teclado.nextDouble();

        double convertePolegadas = valorCentimetros / 2.54;

        System.out.println("A conversão de centímetros para polegadas é: " + convertePolegadas + " polegadas");

        teclado.close();

    }
}

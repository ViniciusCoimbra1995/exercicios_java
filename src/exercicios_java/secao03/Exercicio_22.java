package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de comprimento em jardas: ");
        double valorJardas = teclado.nextDouble();

        double converteMetros = 0.91 * valorJardas;

        System.out.println("O valor do comprimento em jardas convertido para metros é de: " + converteMetros + " metros");

        teclado.close();
    }
}

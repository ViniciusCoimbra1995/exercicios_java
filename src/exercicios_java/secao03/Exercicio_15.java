package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de comprimento em polegadas: ");
        double comprimentoPolegada = teclado.nextDouble();

        double converteCentimetro = comprimentoPolegada * 2.54;

        System.out.println("A conversão de polegadas para centrímetros é " + converteCentimetro + " centímetros");

        teclado.close();
    }
}

package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distância em milhas: ");

        double distanciaMilhas = teclado.nextDouble();

        double  distanciaKM = 1.61 * distanciaMilhas;

        System.out.println("A distância convertida de milhas para quilômetros é: " + distanciaKM + " km");

        teclado.close();
    }
}

package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a distância em quilômetros: ");

        double distanciaKM = teclado.nextDouble();

        double distanciaMilhas = distanciaKM / 1.61;

        System.out.println("A distância de quilômetros para milhas é: " + distanciaMilhas + " milhas");

        teclado.close();

    }
}

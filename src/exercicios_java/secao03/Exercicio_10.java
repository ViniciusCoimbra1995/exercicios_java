package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a velocidade em metros por segundo: ");

        double metrosporsegundo = teclado.nextDouble();

        double kmporhora = metrosporsegundo * 3.6;

        System.out.println("A velocidade em quilômetros por hora é: " + kmporhora + " km por hora");

        teclado.close();
    }
}

package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_24 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita um valor de área em metros quadrados: ");
        double metrosQuadrados = teclado.nextDouble();

        double converteAcres = metrosQuadrados * 0.000247;

        System.out.println("O valor de metros convertido em acres é de: " + converteAcres + " acres");

        teclado.close();
    }
}

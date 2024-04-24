package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em metros cúbicos: ");
        double metrosCubicos = teclado.nextDouble();

        double converteLitros = 1000 * metrosCubicos;

        System.out.println("O valor de conversão de metros cúbicos para litros é: " + converteLitros + " litros");

        teclado.close();
    }
}

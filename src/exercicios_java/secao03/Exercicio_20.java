package exercicios_java.secao03;

import java.util.Scanner;
public class Exercicio_20 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de massa em libras: ");
        double valorLibra = teclado.nextDouble();

        double converteQuilograma = valorLibra * 0.45;

        System.out.println("O valor de massa em libras convertido para quilogramas é de: " + converteQuilograma + " quilogramas");

        teclado.close();
    }
}

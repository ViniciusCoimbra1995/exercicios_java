package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de massa em quilogramas: ");
        double valorDeMassa = teclado.nextDouble();

        double converteLibras = valorDeMassa / 0.45;

        System.out.println("O valor de massa convertido em libras é de: " + converteLibras + " libras");

        teclado.close();
    }
}

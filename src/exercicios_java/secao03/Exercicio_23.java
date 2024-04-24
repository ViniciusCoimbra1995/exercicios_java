package exercicios_java.secao03;

import java.util.Scanner;
public class Exercicio_23 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em metros: ");
        double metros = teclado.nextDouble();

        double converteJardas = metros / 0.91;

        System.out.println("O valor de metros convertido em jardas é de :" + converteJardas + " jardas");

        teclado.close();
    }
}

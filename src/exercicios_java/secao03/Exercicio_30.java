package exercicios_java.secao03;

import java.util.Scanner;
public class Exercicio_30 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor em R$: ");
        double valorReais = teclado.nextDouble();

        double dolarHoje = 5.01;

        double conversaoMoeda = valorReais * dolarHoje;

        System.out.println("O valor de reais convertido em dólares hoje é de US$ " + conversaoMoeda);

        teclado.close();
    }
}

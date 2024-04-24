package exercicios_java.secao03;

/*

Este código Java calcula o volume de um cilindro usando a fórmula matemática para o volume de um cilindro,
que é π * raio² * altura, onde π é uma constante (aproximadamente 3.141592), raio é o raio do cilindro e altura é a altura do cilindro.

 */

import java.util.Scanner;

public class Exercicio_36 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a altura do cilindro: ");
        double alturaCilindro = teclado.nextDouble();

        System.out.println("Digite o raio do cilindro: ");
        double raioCilindro = teclado.nextDouble();

        double volumeCilindro = 3.141592 * (Math.pow(raioCilindro, 2) * alturaCilindro);

        System.out.println("O volume do cilindro é: " + volumeCilindro);

        teclado.close();
    }
}

package exercicios_java.secao03;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double num = teclado.nextDouble();

        // calcular quadrado
        double quadrado = num * num;


        System.out.println("O quadrado de " + num + " é: " + quadrado);

        teclado.close();
    }
}

package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Informe o segundo número: ");
        double num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro número " + num1 + " é maior que o segundo número " + num2);
        } else {
            System.out.println("O segundo número " + num2 + " é maior que o primeiro número " + num1);

            teclado.close();
        }

    }
}

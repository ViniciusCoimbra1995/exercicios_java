package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = teclado.nextInt();

        int maiorNumero = Math.max(num1, num2);

        int diferenca = Math.abs(num1 - num2);

        System.out.println(" O maior número é: " + maiorNumero);
        System.out.println("A diferença entre os números é: " + diferenca);

        teclado.close();


    }
}

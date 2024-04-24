package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = teclado.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma dos três números é: " + soma);

        teclado.close();

    }


}

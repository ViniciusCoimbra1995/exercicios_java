package exercicios_java_secao05;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + "º valor: ");
            int valor = scanner.nextInt();

            soma += valor;
            contador++;

        }

        double media = (double) soma / 10;

        System.out.println("A média dos 10 valores é: " + media);

        scanner.close();


    }
}

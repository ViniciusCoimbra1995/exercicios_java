package exercicios_java_secao04;

// O programa recebe um inteiro, se o número for menor que zero, é impressa a mensagem de número inválido.
// Se for positivo, ele calcula o logaritmo do número

import java.util.Scanner;

public class Exercicio_12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido");
            scanner.close();
            return;
        }

        double calculaLogaritmo = Math.log(numero);

        System.out.println("O Logaritmo do número " + numero + " é: " + calculaLogaritmo);

        scanner.close();

    }
}

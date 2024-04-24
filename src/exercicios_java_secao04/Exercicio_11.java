package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número é maior que zero
        if (numero <= 0) {
            System.out.println("Número inválido");
            scanner.close();
            return; // Encerra o programa
        }

        // Variável para armazenar a soma dos dígitos
        int soma = 0;

        // Calcular a soma dos dígitos do número
        while (numero > 0) {
            // Obter o último dígito do número
            int digito = numero % 10;
            // Adicionar o dígito à soma
            soma += digito;
            // Remover o último dígito do número
            numero /= 10;
        }

        // Exibir a soma dos dígitos
        System.out.println("A soma dos dígitos do número é: " + soma);

        scanner.close();
    }
}

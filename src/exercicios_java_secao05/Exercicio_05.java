package exercicios_java_secao05;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1; // Inicializa o contador
        int soma = 0; // Inicializa a variável para armazenar a soma dos valores

        // Loop para pedir ao usuário para digitar 10 valores
        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º valor: ");
            int valor = scanner.nextInt();

            soma += valor; // Adiciona o valor à soma total
            contador++; // Incrementa o contador para contar a próxima iteração
        }

        // Após o loop, exibe a soma total dos valores
        System.out.println("A soma dos 10 valores é: " + soma);

        scanner.close();
    }
}

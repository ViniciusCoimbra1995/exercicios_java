package exercicios_java_secao05;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0; // Inicializa o contador de números lidos
        int soma = 0; // Inicializa a variável para armazenar a soma dos números

        // Loop para ler 10 números positivos
        while (contador < 10) {
            System.out.print("Digite um º" + contador + " de valor positivo: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero; // Adiciona o número à soma total
                contador++; // Incrementa o contador apenas se o número for positivo
            } else {
                System.out.println("Número não positivo, será ignorado.");
            }
        }

        // Calcula a média dos números positivos
        double media = (double) soma / 10;

        // Exibe a média dos números positivos
        System.out.println("A média dos números positivos é: " + media);

        scanner.close();

    }
}

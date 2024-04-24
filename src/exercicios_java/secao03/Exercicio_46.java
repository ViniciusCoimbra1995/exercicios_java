package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_46 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número inteiro positivo de três dígitos
        System.out.print("Digite um número inteiro positivo de três dígitos (entre 100 e 999): ");
        int numero = scanner.nextInt();

        // Verificar se o número está dentro do intervalo especificado
        if (numero < 100 || numero > 999) {
            System.out.println("O número digitado não está dentro do intervalo válido.");
        } else {
            // Separar os dígitos do número
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            // Inverter os dígitos
            int numeroInvertido = unidade * 100 + dezena * 10 + centena;

            // Exibir o número invertido
            System.out.println("O número invertido é: " + numeroInvertido);
        }

        scanner.close();
    }
}

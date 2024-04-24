package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade do trabalhador
        System.out.print("Digite a idade do trabalhador: ");
        int idade = scanner.nextInt();

        // Solicitar o tempo de serviço do trabalhador
        System.out.print("Digite o tempo de serviço do trabalhador (em anos): ");
        int tempoServico = scanner.nextInt();

        // Verificar se o trabalhador pode se aposentar
        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("O trabalhador pode se aposentar.");
        } else {
            System.out.println("O trabalhador não pode se aposentar.");
        }

        scanner.close();
    }

}

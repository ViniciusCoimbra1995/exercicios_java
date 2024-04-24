package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();

        // Determinar a classificação da pessoa com base na altura e peso
        char classificacao;
        if (altura < 1.20) {
            if (peso <= 60) {
                classificacao = 'A';
            } else if (peso <= 90) {
                classificacao = 'D';
            } else {
                classificacao = 'G';
            }
        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso <= 60) {
                classificacao = 'B';
            } else if (peso <= 90) {
                classificacao = 'E';
            } else {
                classificacao = 'H';
            }
        } else {
            if (peso <= 60) {
                classificacao = 'C';
            } else if (peso <= 90) {
                classificacao = 'F';
            } else {
                classificacao = 'I';
            }
        }

        // Exibir a classificação da pessoa
        System.out.println("Classificação da pessoa: " + classificacao);

        scanner.close();

    }
}

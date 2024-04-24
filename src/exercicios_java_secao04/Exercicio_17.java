package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a base maior
        System.out.print("Digite o valor da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        // Verificar se a base maior é maior que zero
        if (baseMaior <= 0) {
            System.out.println("A base maior deve ser um número maior que zero.");
            scanner.close();
            return; // Encerra o programa
        }

        // Solicitar a entrada do usuário para a base menor
        System.out.print("Digite o valor da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        // Verificar se a base menor é maior que zero
        if (baseMenor <= 0) {
            System.out.println("A base menor deve ser um número maior que zero.");
            scanner.close();
            return; // Encerra o programa
        }

        // Solicitar a entrada do usuário para a altura
        System.out.print("Digite o valor da altura do trapézio: ");
        double altura = scanner.nextDouble();

        // Calcular a área do trapézio
        double area = (baseMaior + baseMenor) * altura / 2;

        // Exibir a área do trapézio
        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }

}

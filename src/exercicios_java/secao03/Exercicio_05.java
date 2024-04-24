package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");

        // Lê a temperatura em Celsius fornecida pelo usuário
        double temperaturaCelsius = scanner.nextDouble();

        // Converte a temperatura de Celsius para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * (9.0 / 5.0)) + 32.0;

        // Apresenta o resultado da conversão
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit + " °F");

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");

        double temperaturaCelsius = teclado.nextDouble();

        double temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("A temperatura em graus Kelvin é: " + temperaturaKelvin);

    }
}

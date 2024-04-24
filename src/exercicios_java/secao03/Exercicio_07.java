package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Temperatura em Kelvin: ");

        double temperaturaKelvin = teclado.nextDouble();

        double temperaturaCelsius = temperaturaKelvin - 273.15;

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " ºC");

        teclado.close();
    }
}

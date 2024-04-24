package exercicios_java.secao03;
import java.util.Scanner;


public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = teclado.nextDouble();

        double temperaturaCelsius = 5.0 * (temperaturaFahrenheit - 32.0) / 9.0;

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " ºC");

        teclado.close();

    }
}

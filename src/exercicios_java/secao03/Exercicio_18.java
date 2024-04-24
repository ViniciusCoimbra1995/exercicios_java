package exercicios_java.secao03;
import java.util.Scanner;

public class Exercicio_18 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em litros: ");
        double litros = teclado.nextDouble();

        double metrosCubicos = litros / 1000;

        System.out.println(" A conversão de litros para metros cúbicos é: " + metrosCubicos + " metros cúbicos");

        teclado.close();
    }
}

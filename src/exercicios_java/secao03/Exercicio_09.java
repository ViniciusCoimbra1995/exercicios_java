package exercicios_java.secao03;
import java.util.Scanner;

public class Exercicio_09 {
    public static void main (String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a velocidade em K/M: ");

    double velocidadekm = teclado.nextDouble();

    double velocidadems = velocidadekm / 3.6;

    System.out.println(" A velicidade em metros por segundo é: " + velocidadems + " metros por segundo");

    teclado.close();

    }
}

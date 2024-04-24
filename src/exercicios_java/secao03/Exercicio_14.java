package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ângulo em radianos: ");

        double anguloRadianos = teclado.nextDouble();

        double converteGraus = anguloRadianos * 180 / 3.14;

        System.out.println(" A conversão do ângulo radianos para graus é: " + converteGraus + " graus");

        teclado.close();

    }
}

package exercicios_java.secao03;

// Leia um ângulo em graus e apresente-o convertido em radianos. A formula de conversão é:
// R = G * tt / 180, sendo G o ângulo em graus e R em radianos e tt = 3.14

import java.util.Scanner;

public class Exercicio_13 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ângulo em Graus: ");

        double anguloGrau = teclado.nextDouble();

        double converteRadianos = anguloGrau * 3.14 / 180;

        System.out.println("A conversão de ângulo em graus para radianos é: " + converteRadianos);

        teclado.close();

    }
}

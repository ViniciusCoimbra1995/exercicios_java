package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o IMC: ");
        double imc = scanner.nextDouble();

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Está com o peso saudável");
        }else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Está com o peso em excesso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Está com obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Está com obesidade grau 2");
        } else {
            System.out.println("Está com obesidade grau 3 (Mórbida)");

        }

        scanner.close();
    }

}


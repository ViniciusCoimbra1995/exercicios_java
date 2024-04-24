package exercicios_java_secao04;

// O código abaixo recebe duas notas para um aluno onde se a nota for válida, ele imprime a média, se não o programa para.
// Nota válida é entre 0.0 e 10.0

import java.util.Scanner;
public class Exercicio_08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        if (nota1 < 0.0 || nota1 > 10.0 || nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Uma ou ambas as notas são inválidas, as notas devem ser de 0.0 a 10.0");

            System.exit(0);
        }

        double calculaMedia = (nota1 + nota2) / 2;

        System.out.println("A média das notas do aluno é: " + calculaMedia);

        scanner.close();

    }
}

package exercicios_java_secao04;

/*
Faça um programa java que calcule a média ponderada de notas de 3 provas. A primeira e a segunda prova tem peso 1, e a terceira tem peso 2.
Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual ou superior a 60 pontos.


 */

import java.util.Scanner;

public class Exercicio_13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 * 1 + nota2 * 1 + nota3 * 2) / (1 + 1 + 2);

        System.out.println("A média do aluno é: " + media);

        if (media >= 60) {
            System.out.println("O aluno foi aprovado!!!");
        }else {
            System.out.println("O aluno não atingiu 60 pontos, portanto está reprovado.");
        }

        scanner.close();

    }
}

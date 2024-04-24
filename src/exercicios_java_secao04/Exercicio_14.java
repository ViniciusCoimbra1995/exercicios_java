package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê as notas do trabalho de laboratório, avaliação semestral e exame final
        System.out.println("Digite a nota do trabalho de laboratório (entre 0 e 10):");
        double notaLaboratorio = scanner.nextDouble();

        // Verifica se a nota do trabalho de laboratório está no intervalo válido
        if (notaLaboratorio < 0 || notaLaboratorio > 10) {
            System.out.println("Nota inválida para o trabalho de laboratório. O programa será encerrado.");
            return;
        }

        System.out.println("Digite a nota da avaliação semestral (entre 0 e 10):");
        double notaSemestral = scanner.nextDouble();

        // Verifica se a nota da avaliação semestral está no intervalo válido
        if (notaSemestral < 0 || notaSemestral > 10) {
            System.out.println("Nota inválida para a avaliação semestral. O programa será encerrado.");
            return;
        }

        System.out.println("Digite a nota do exame final (entre 0 e 10):");
        double notaExameFinal = scanner.nextDouble();

        // Verifica se a nota do exame final está no intervalo válido
        if (notaExameFinal < 0 || notaExameFinal > 10) {
            System.out.println("Nota inválida para o exame final. O programa será encerrado.");
            return;
        }

        // Calcula a nota final ponderada
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;

        // Exibe a nota final
        System.out.println("A nota final do aluno é: " + notaFinal);

        // Determina a situação do aluno
        if (notaFinal < 3) {
            System.out.println("O aluno está reprovado.");
        } else if (notaFinal >= 3 && notaFinal < 5) {
            System.out.println("O aluno está em recuperação.");
        } else {
            System.out.println("O aluno está aprovado.");
        }

        scanner.close();
    }

}

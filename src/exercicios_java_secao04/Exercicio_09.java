package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do trabalhador: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor da prestação do empréstimo: ");
        double prestacaoEmprestimo = scanner.nextDouble();

        double limitePrestacao = salario * 0.20;

        if (prestacaoEmprestimo > limitePrestacao) {
            System.out.println("O valor da prestação supera 20% do salário do trabalhador, empréstimo não concedido");
        }else{
            System.out.println("Empréstimo concedido");
        }

        scanner.close();
    }
}

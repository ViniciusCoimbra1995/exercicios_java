package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário atual do funcionário
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Solicitar o tempo de serviço do funcionário
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoServico = scanner.nextInt();

        // Calcular o reajuste salarial e o bônus de acordo com a tabela fornecida
        double reajuste = 0;
        int bonus = 0;

        if (salarioAtual <= 500) {
            reajuste = salarioAtual * 0.25;
            if (tempoServico >= 1) {
                bonus = 0;
            }
        } else if (salarioAtual <= 1000) {
            reajuste = salarioAtual * 0.20;
            if (tempoServico >= 1 && tempoServico <= 3) {
                bonus = 100;
            }
        } else if (salarioAtual <= 1500) {
            reajuste = salarioAtual * 0.15;
            if (tempoServico >= 4 && tempoServico <= 6) {
                bonus = 200;
            }
        } else if (salarioAtual <= 2000) {
            reajuste = salarioAtual * 0.10;
            if (tempoServico >= 7 && tempoServico <= 10) {
                bonus = 300;
            }
        } else {
            bonus = 500;
        }

        // Calcular o salário final reajustado
        double salarioFinal = salarioAtual + reajuste + bonus;

        // Verificar se o funcionário teve aumento ou não
        if (reajuste == 0 && bonus == 0) {
            System.out.println("O funcionário não tem direito a aumento.");
        } else {
            System.out.println("O salário final reajustado é: R$" + salarioFinal);
        }

        scanner.close();
    }
}

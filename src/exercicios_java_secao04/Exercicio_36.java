package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da venda: ");
        double vendaMensal = scanner.nextDouble();

        double comissao;
        if (vendaMensal >= 100000) {
            comissao = 700 + (vendaMensal * 0.16);
        } else if (vendaMensal <= 100000 && vendaMensal >= 80000) {
            comissao = 650 + (vendaMensal * 0.14);
        } else if (vendaMensal <= 80000 && vendaMensal >= 60000) {
            comissao = 600 + (vendaMensal * 0.14);
        } else if (vendaMensal <= 60000 && vendaMensal >= 40000) {
            comissao = 550 + (vendaMensal * 0.14);
        } else if (vendaMensal <= 40000 && vendaMensal >= 20000) {
            comissao = 500 + (vendaMensal * 0.14);
        } else {
            comissao = 400 + (vendaMensal * 0.14);

        }

        System.out.println("O valor de comissão a ser recebido é: R$ " + comissao);

        scanner.close();

    }

}






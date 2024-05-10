package exercicios_java_secao04;

//Este código solicita ao usuário que insira o custo de fábrica do carro e, em seguida, calcula a comissão do distribuidor e os impostos com base na tabela fornecida.
// Em seguida, calcula e imprime o custo total ao consumidor.

import java.util.Scanner;

public class Exercicio_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double comissaoDistribuidor;
        double impostos;

        if (custoFabrica <= 12000) {
            comissaoDistribuidor = custoFabrica * 0.05;
            impostos = 0;
        } else if (custoFabrica > 12000 && custoFabrica <= 25000) {
            comissaoDistribuidor = custoFabrica * 0.10;
            impostos = custoFabrica * 0.15;
        } else {
            comissaoDistribuidor = custoFabrica * 0.15;
            impostos = custoFabrica * 0.20;
        }

        double custoConsumidor = custoFabrica + comissaoDistribuidor + impostos;

        System.out.println("O custo ao consumidor é: R$" + custoConsumidor);

        scanner.close();

    }
}


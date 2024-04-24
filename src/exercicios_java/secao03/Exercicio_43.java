package exercicios_java.secao03;

import java.util.Scanner;

public class Exercicio_43 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor total da venda
        System.out.print("Digite o valor total da venda: ");
        double valorTotal = scanner.nextDouble();

        // Calcular o valor com desconto de 10%
        double valorDesconto = valorTotal * 0.10;
        double valorComDesconto = valorTotal - valorDesconto;

        // Calcular o valor de cada parcela (3 vezes sem juros)
        double valorParcela = valorComDesconto / 3;

        // Calcular a comissão do vendedor no caso da venda à vista (5% sobre o valor com desconto)
        double comissaoAVista = valorComDesconto * 0.05;

        // Calcular a comissão do vendedor no caso da venda parcelada (5% sobre o valor total)
        double comissaoParcelado = valorTotal * 0.05;

        // Mostrar o total a pagar com desconto de 10%
        System.out.println("Total a pagar com desconto de 10%: R$ " + valorComDesconto);

        // Mostrar o valor de cada parcela (3 vezes sem juros)
        System.out.println("Valor de cada parcela (3 vezes sem juros): R$ " + valorParcela);

        // Mostrar a comissão do vendedor no caso da venda à vista
        System.out.println("Comissão do vendedor (venda à vista): R$ " + comissaoAVista);

        // Mostrar a comissão do vendedor no caso da venda parcelada
        System.out.println("Comissão do vendedor (venda parcelada): R$ " + comissaoParcelado);

        scanner.close();

    }
}

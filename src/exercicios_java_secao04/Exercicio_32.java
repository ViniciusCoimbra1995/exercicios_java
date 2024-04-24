package exercicios_java_secao04;

/*

Segue abaixo um exemplo de código Java que atende às especificações fornecidas.
Ele solicita ao usuário o código do produto e a quantidade desejada, e em seguida calcula o valor total do pedido com base nas informações fornecidas

 */

import java.util.Scanner;

public class Exercicio_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Apresenta o cardápio
        System.out.println("Cardápio da Lanchonete:");
        System.out.println("Especificação       Código  Preço");
        System.out.println("Cachorro quente     100     1.20");
        System.out.println("Bauru simples       101     1.30");
        System.out.println("Bauru com ovo       102     1.50");
        System.out.println("Hamburguer          103     1.20");
        System.out.println("Cheeseburguer       104     1.70");
        System.out.println("Suco                105     2.20");
        System.out.println("Refrigerante        106     1.00");

        // Solicita e lê o código do produto e a quantidade
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        // Calcula o valor total do pedido
        double valorTotal = 0;
        switch (codigo) {
            case 100:
                valorTotal = quantidade * 1.20;
                break;
            case 101:
                valorTotal = quantidade * 1.30;
                break;
            case 102:
                valorTotal = quantidade * 1.50;
                break;
            case 103:
                valorTotal = quantidade * 1.20;
                break;
            case 104:
                valorTotal = quantidade * 1.70;
                break;
            case 105:
                valorTotal = quantidade * 2.20;
                break;
            case 106:
                valorTotal = quantidade * 1.00;
                break;
            default:
                System.out.println("Código inválido! Por favor, escolha um código válido.");
                return;
        }

        // Exibe o valor total do pedido
        System.out.println("Valor total do pedido: R$ " + valorTotal);

        scanner.close();

    }
}

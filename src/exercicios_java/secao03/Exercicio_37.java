package exercicios_java.secao03;

/*
Aqui está um código Java que lê o valor de um produto e calcula o valor com desconto de 12%, em seguida, imprime o resultado:

 */

import java.util.Scanner;

public class Exercicio_37 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();

        double desconto = valorProduto * 0.12;

        double valorcomDesconto = valorProduto - desconto;

        System.out.println("O valor " + valorcomDesconto + " contém 12% de desconto");

        teclado.close();
    }
}

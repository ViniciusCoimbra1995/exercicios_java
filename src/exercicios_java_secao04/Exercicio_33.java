package exercicios_java_secao04;

/*
Nesse código corrigido, primeiro calculamos o acréscimo baseado no preço antigo, e então somamos esse acréscimo ao preço antigo para obter o preço total.
O resultado será calculado corretamente agora.

 */

import java.util.Scanner;

public class Exercicio_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço antigo: ");
        double precoAntigo = scanner.nextDouble();

        double acrescimo;
        if (precoAntigo <= 50) {
            acrescimo = precoAntigo * 0.05;
        } else if (precoAntigo >= 50 && precoAntigo <= 100) {
            acrescimo = precoAntigo * 0.10;
        } else {
            acrescimo = precoAntigo * 0.15;
        }

        double precoTotal = precoAntigo + acrescimo;
        System.out.println("Produto terá acréscimo de " + (acrescimo * 100 / precoAntigo) + "% e totalizará: R$ " + precoTotal);

        scanner.close();

    }

}

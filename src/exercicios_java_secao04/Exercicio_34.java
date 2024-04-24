package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço novo: ");
        double precoNovo = scanner.nextDouble();
        
       if (precoNovo <= 80) {
           System.out.println("O preço do produto é barato");
       } else if (precoNovo >= 80 && precoNovo <= 120) {
           System.out.println("O preço está normal");
       } else if (precoNovo >= 120 && precoNovo <= 200) {
           System.out.println("O preço está caro");
       } else {
           System.out.println("O produto está muito caro!");
       }

       scanner.close();

    }
}



package exercicios_java_secao04;

/*
Neste programa, solicitamos ao usuário a distância percorrida em km e a quantidade de litros de gasolina consumidos.
Em seguida, calculamos o consumo em km/l dividindo a distância pela quantidade de litros.
Com base no consumo calculado, determinamos a mensagem correspondente de acordo com a tabela fornecida. Finalmente, exibimos o consumo e a mensagem na tela.

 */

import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância em KM: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite a quantidade de litros de gasolina: ");
        double litrosGasolina = scanner.nextDouble();

        double consumo = distancia / litrosGasolina;

        String mensagem;
        if (consumo < 8) {
            mensagem = "Venda o caro!";
        } else if (consumo >= 8 && consumo <= 14) {
            mensagem = "Econômico!";
        } else {
            mensagem = "Super econômico!";

        }

        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Mensagem: " + mensagem);

        scanner.close();


    }
}

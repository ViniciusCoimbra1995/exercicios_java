package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do veículo: ");
        double custodeFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0;
        double percentualImpostos = 0;

        if(custodeFabrica <= 12000) {
            percentualDistribuidor = custodeFabrica * 0.5;
            percentualImpostos = 0;
        } else if (custodeFabrica >= 12000 && custodeFabrica <= 25000) {
            percentualDistribuidor = custodeFabrica * 0.10;
            percentualImpostos = custodeFabrica * 0.15;
        } else if (custodeFabrica >= 25000) {
            percentualDistribuidor = custodeFabrica * 0.15;
            percentualImpostos = custodeFabrica * 0.20;

        }

    }
}


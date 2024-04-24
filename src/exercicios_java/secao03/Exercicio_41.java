package exercicios_java.secao03;

/*

Este código Java solicita ao usuário o valor da hora de trabalho e o número de horas trabalhadas.
Em seguida, calcula o salário do funcionário com base nessas informações, considerando uma comissão de 10% sobre o salário calculado.

 */

import java.util.Scanner;

public class Exercicio_41 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHora = teclado.nextDouble();

        System.out.println("Digite o número de horas trabalhadas: ");
        double horas = teclado.nextDouble();

        double comissao = 0.10;

        double calculaSalario = valorHora * horas;

        double calculaComissao = calculaSalario * comissao;

        double salarioFinal = calculaSalario + calculaComissao;

        System.out.println("O valor do salário do funcionário é de R$: " + salarioFinal);

        teclado.close();

    }

}

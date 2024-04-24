package exercicios_java.secao03;

/*
Uma empresa contrata um encanador a R$ 30,00 por dia.
Faça um programa Java que solicite o número de dias trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga,
sabendo-se que são descontados 8% para imposto de reda.

 */

import java.util.Scanner;

public class Exercicio_40 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias trabalhados: ");
        int dias = teclado.nextInt();

        double valorDia = 30.00;

        double calculaDiasTrabalho = valorDia * dias;

        double imposto = 0.08;

        double liquido = calculaDiasTrabalho * imposto;

        double valorFinal = calculaDiasTrabalho - liquido;

        System.out.println("O salário do encanador é de: R$ " + valorFinal);

        teclado.close();
    }
}

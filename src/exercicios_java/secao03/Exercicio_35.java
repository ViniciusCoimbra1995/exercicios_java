package exercicios_java.secao03;

/*
Para criar uma variável em Java chamada "hipotenusa" que armazena o cálculo da hipotenusa de um triângulo retângulo,
você pode usar a classe Math para calcular a raiz quadrada. Aqui está como você pode fazer isso:

 */


import java.util.Scanner;

public class Exercicio_35 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double valorA = teclado.nextDouble();

        System.out.println("Digite o valor de b: ");
        double valorB = teclado.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2));

        System.out.println("A hipotenusa é: " + hipotenusa);

        teclado.close();
    }
}

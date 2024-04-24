package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = teclado.nextDouble();

        double raizQuadrada = Math.sqrt(numero);

        if (numero > 0) {
            System.out.println("A raíz quadrada do número informado é: " + raizQuadrada);
        } else {
                System.out.println("O número informado é negativo, portanto é inválido");

        }

        teclado.close();


    }


}

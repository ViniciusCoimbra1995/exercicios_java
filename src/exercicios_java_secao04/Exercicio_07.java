package exercicios_java_secao04;

// O programa recebe dois números e mostra o maior. Se os números forem iguais, ele imprime uma mensagem falando que os números são iguais

import java.util.Scanner;

public class Exercicio_07 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        }else if (num1 == num2) {
            System.out.println("Os números são iguais");
        }else{
            System.out.println("O segundo número é maior que o primeiro");

        }

        teclado.close();

    }

}


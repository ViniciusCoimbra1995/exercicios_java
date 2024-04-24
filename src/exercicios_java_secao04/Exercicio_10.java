package exercicios_java_secao04;

import java.util.Scanner;
public class Exercicio_10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        }else{
            System.out.println("Sexo inválido.");
            scanner.close();
            return;

        }

        System.out.println("O peso ideal para uma pessoa de altura " + altura + " metros e sexo " + sexo + " é: " + pesoIdeal + " kg");

        scanner.close();
    }


}


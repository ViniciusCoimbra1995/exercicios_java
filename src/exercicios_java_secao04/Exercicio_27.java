package exercicios_java_secao04;

import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador(a): ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador(a) estará na categoria infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("O nadador(a) estará na categoria Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("O nadador(a) estará na categoria Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador(a) estará na categoria Juvenil B");

        } else if (idade >= 18) {
            System.out.println("Nadador estará na categoria Sênior");

        } else {
            System.out.println("A idade selecionada é invalida");

        }

        scanner.close();

    }

}
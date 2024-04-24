package exercicios_java_secao04;

import java.util.Scanner;
public class Exercicio_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite o Estado: ");
        System.out.println("1. MG");
        System.out.println("2. SP");
        System.out.println("3. RJ");
        System.out.println("4. MS");

        double mg = 0.07;
        double sp = 0.12;
        double rj = 0.15;
        double ms = 0.08;

        // Solicitar a escolha do usuário
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado;
        switch (opcao) {
            case 1:
                resultado = (valorProduto * mg) + valorProduto;
                System.out.println("O valor final do produto com imposto de Minas Gerais é " + resultado);
                break;
            case 2:
                resultado = (valorProduto * sp) + valorProduto;
                System.out.println("O valor final do produto com imposto de São Paulo é " + resultado);
                break;
            case 3:
                resultado = (valorProduto * rj) + valorProduto;
                System.out.println("O valor final do produto com imposto do Rio de Janeiro é " + resultado);
                break;
            case 4:
                resultado = (valorProduto * ms) + valorProduto;
                System.out.println("O valor final do produto com imposto do Mato Grosso do Sul é " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");

        }

            scanner.close();


    }
}

package exercicios_java_secao05;

// Escreva um programa que escreva na tela de 1 até 100, de 1 em 1, 3 vezes.
// Primeiro usando for, depois while e depois do while

public class exercicio_2_dowhile {
    public static void main(String[] args) {
        int numero = 1;

        // Usando um loop do-while para contar de 1 até 100
        do {
            System.out.println(numero);
            numero++;
        } while (numero <=100);
    }
}

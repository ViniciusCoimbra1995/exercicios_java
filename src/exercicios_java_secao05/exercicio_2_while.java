package exercicios_java_secao05;

// Escreva um programa que escreva na tela de 1 até 100, de 1 em 1, 3 vezes.
// Primeiro usando for, depois while e depois do while.

public class exercicio_2_while {
    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 100) {
            System.out.println(numero);

            numero++;
        }
    }
}

package exercicios_java_secao05;

public class Exercicio_01 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        System.out.println("Os cinco primeiros múltiplos de 3 são:");

        // Enquanto não encontrarmos os cinco primeiros múltiplos de 3
        while (contador < 5) {
            // Verifica se o número é múltiplo de 3
            if (numero % 3 == 0) {
                // Se for múltiplo de 3, imprime o número
                System.out.println(numero);
                // Incrementa o contador de múltiplos encontrados
                contador++;
            }
            // Incrementa o número para verificar o próximo
            numero++;
        }
    }
}

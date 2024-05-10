package exercicios_java_secao05;

public class Exercicio_04 {
    public static void main(String[] args) {
        int numero = 0;

        // Usando um loop while para incrementar o número de 1000 em 1000 até que seja 100000
        while (numero <= 100000) {
            System.out.println(numero);
            numero += 1000; // Incrementa o número em 1000
        }
    }
}

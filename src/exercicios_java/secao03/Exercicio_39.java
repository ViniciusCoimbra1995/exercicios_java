package exercicios_java.secao03;


public class Exercicio_39 {
    public static void main (String[] args) {

        double premioTotal = 780000;

        double ganhador1 = premioTotal * 0.46;
        double ganhador2 = premioTotal * 0.32;
        double ganhador3 = premioTotal - ganhador1 - ganhador2;

        System.out.println("O primeiro ganhador receberá R$ " + ganhador1);
        System.out.println("O segundo ganhador receberá R$ " + ganhador2);
        System.out.println("O terceiro ganhador receberá R$ " + ganhador3);
    }
}

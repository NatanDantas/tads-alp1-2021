package lista_exercicios;

import java.util.Scanner;

public class Numero_negativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número a ser verificado: ");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo");
        } else {
            System.out.println("O número " + numero + " é negativo");
        }
    }

}

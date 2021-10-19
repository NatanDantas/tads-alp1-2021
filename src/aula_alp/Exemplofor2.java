package aula_alp;

import java.util.Scanner;

public class Exemplofor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, soma = 0, somaN = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Número: ");
            x = entrada.nextInt();
            if (x > 0) {
                soma = soma + x;
            } else {
                //System.out.println("Numero negativo");
               somaN = somaN + x;
            }

        }
        System.out.println("Positivos: " + soma);
        System.out.println("Negativos: " + somaN);
    }
}

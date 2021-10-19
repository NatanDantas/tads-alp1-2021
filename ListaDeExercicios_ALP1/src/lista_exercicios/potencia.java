package lista_exercicios;

import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, expo, pot;

        System.out.println("Digite a base: ");
        base = entrada.nextDouble();
        System.out.println("Digite o expoente: ");
        expo = entrada.nextDouble();

        pot = Math.pow(base, expo);
        System.out.println(base + " Elevado a " + expo + " é igual a: " + pot);

    }

}

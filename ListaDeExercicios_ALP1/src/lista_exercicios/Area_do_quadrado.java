package lista_exercicios;

import java.util.Scanner;

public class Area_do_quadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, area;

        System.out.println("Digite a medida de um dos lados do quadrado: ");
        lado = entrada.nextDouble();

        area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é de: " + area + " metros quadrados");

    }

}

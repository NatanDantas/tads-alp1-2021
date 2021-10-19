package lista_exercicios;

import java.util.Scanner;

public class Calculobaskhara {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A, B, C, delta, x1, x2;

        System.out.println("Digite o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextFloat();
        System.out.println("Digite o valor de C: ");
        C = entrada.nextFloat();

        delta = (B * B) - 4 * A * C;
        if (delta > 0) {
            x1 = (float) ((B + Math.sqrt(delta)) / 2 * A);
            x2 = (float) ((B - Math.sqrt(delta)) / 2 * A);
            System.out.println("A equação possui 2 raízes reais");
            System.out.println("X1: " + x1 + "\nX2: " + x2);
        } else if (delta == 0) {
            System.out.println("Delta é 0, impossível calcular ");
        } else {
            System.out.println("O valor de delta é negativo " + delta);
        }

    }

}

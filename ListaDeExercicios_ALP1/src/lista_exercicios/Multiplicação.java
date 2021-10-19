package lista_exercicios;

import java.util.Scanner;

public class Multiplicação {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, mult;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        mult = num1 * num2;
        System.out.println("O resultado da multiplicação entre esses dois números é: " + mult);
    }

}

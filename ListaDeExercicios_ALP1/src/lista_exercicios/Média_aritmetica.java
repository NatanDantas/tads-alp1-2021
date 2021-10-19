package lista_exercicios;

import java.util.Scanner;

public class Média_aritmetica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3, num4, media;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();
        System.out.println("Digite o terceiro número: ");
        num3 = entrada.nextFloat();
        System.out.println("Digite o quarto número: ");
        num4 = entrada.nextFloat();

        media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A média aritmética entre esse números é igual a: " + media);

    }

}

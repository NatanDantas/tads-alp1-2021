package lista_exercicios;

import java.util.Scanner;

public class Soma_dos_quadrados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        soma = (num1 * num1) + (num2 * num2);
        System.out.println("A soma dos quadrados entre " + num1 + " e " + num2 + " é de: " + soma);

    }

}

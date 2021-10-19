package aula_alp;

import java.util.Scanner;

public class ExemploDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, i = 1, soma = 0;

        while (i <= 10) {
            System.out.println("Digite um número: " + i);
            x = entrada.nextInt();
            if (x < 0) {
                System.err.println("NÚMERO INVÁLIDO!");
                break;
            }
            soma += x;
            i++;
        }
        System.out.println("Total da soma é igual à: " + soma);
    }

}

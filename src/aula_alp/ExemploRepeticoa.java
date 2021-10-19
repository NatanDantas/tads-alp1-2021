package aula_alp;

import java.util.Scanner;

public class ExemploRepeticoa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i = 1;

        System.out.println("Digite o número: ");
        n = entrada.nextInt();

        while (i <= n) {
            System.out.println("Algoritmos 1 " + i);

            if (i == 5) {
                System.out.println("i é igual a 5");
            }
            i++;
        }
        System.out.println("Fora do while");
    }

}

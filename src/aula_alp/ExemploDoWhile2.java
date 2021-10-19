package aula_alp;

import java.util.Scanner;

public class ExemploDoWhile2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float deposito, saldo = 0;
        int i = 0;

        System.out.println("Banco Dos Bloons");

        do {
            System.out.println("Digite o valor do depósito:");
            deposito = entrada.nextInt();
            System.out.println("Quantidade de depósitos: " + i);
            if (deposito <= 0) {
                System.out.println("Depósito Encerrado!");
                System.out.printf("Você fez %d depósitos \n", i);
                break;
            } else {
                saldo += deposito;
                System.out.println("Seu saldo atual é de: " + saldo);
                i++;
            }

        } while (deposito > 0);

        System.out.printf("Seu saldo total é de: %.2f \n", saldo);
    }
}

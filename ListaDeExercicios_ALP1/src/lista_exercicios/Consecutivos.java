package lista_exercicios;

import java.util.Scanner;

public class Consecutivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, con1, con2;

        System.out.println("Digite o primero número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        con1 = (num1 + 1);
        con2 = (num2 + 1);
        System.out.println("Os números consecutivos são: " + con1 + " e " + con2);

    }

}

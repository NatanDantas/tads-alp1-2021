package aula_alp;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, j = 10;

        while (i <= j) {
            System.out.println("J: " + j);
            System.out.println("I: " + i);
            j--;
            i++;
        }
        System.out.println("Fora do while");
    }

}

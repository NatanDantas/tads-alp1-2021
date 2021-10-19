package lista_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Divisaomaiormenor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, divi;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        DecimalFormat df = new DecimalFormat("0.##");

        if (num1 > num2) {
            divi = num1 / num2;
            System.out.println("A divisão entre os dois números é igual à: " + df.format(divi));
        } else {
            divi = num2 / num1;
            System.out.println("A divisão entre os dois números é igual à: " + df.format(divi));
        }

    }

}

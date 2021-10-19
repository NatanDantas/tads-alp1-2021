package lista_exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class calculoHipotenusa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A, B, hipo1, hipo2;

        System.out.println("Informe o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Informe o valor de B: ");
        B = entrada.nextFloat();

        DecimalFormat df = new DecimalFormat("0.##");
        hipo1 = (float) (Math.pow(A, 2) + Math.pow(B, 2));
        hipo2 = (float) Math.sqrt(hipo1);
        System.out.println("O valor da Hipotenusa é de: " + df.format(hipo2));
    }

}

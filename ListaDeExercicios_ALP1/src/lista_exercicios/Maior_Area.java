package lista_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maior_Area {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float L, R, areaQuadrado, raioC;

        System.out.println("Digite o valor de L: ");
        L = entrada.nextFloat();
        System.out.println("Digite o valor de R: ");
        R = entrada.nextFloat();

        DecimalFormat df = new DecimalFormat("0.##");
        areaQuadrado = (L * L);
        System.out.println("A área do quadrado é igual à: " + df.format(areaQuadrado));
        raioC = (float) (3.14 * R * R);
        System.out.println("A área do círculo é igual à: " + df.format(raioC));

        if (areaQuadrado > raioC) {
            System.out.println("O quadrado é maior que o círculo");
        } else {
            System.out.println("O círculo é maior que o quadrado");
        }
    }

}

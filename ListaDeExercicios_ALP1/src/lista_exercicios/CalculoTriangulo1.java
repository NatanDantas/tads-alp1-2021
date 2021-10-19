package lista_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoTriangulo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A, B, C, areaTr, areaC, areaTrapezio, areaQuadrado, areaRetangulo, perimetroR;

        System.out.println("Informe o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Informe o valor de B: ");
        B = entrada.nextFloat();
        System.out.println("Informe o valor de C: ");
        C = entrada.nextFloat();

        DecimalFormat df = new DecimalFormat("0.##");
        areaTr = (A * C) / 2;
        System.out.println("A área do triângulo retângulo é igual à: " + df.format(areaTr));

        areaC = (float) (3.14 * C * C);
        System.out.println("A área do círculo é igual à: " + df.format(areaC));

        areaTrapezio = ((A + B) * C) / 2;
        System.out.println("A área do trapézio é igual à: " + df.format(areaTrapezio));

        areaQuadrado = (B * B);
        System.out.println("A área do quadrado é igual à: " + df.format(areaQuadrado));

        areaRetangulo = (A * B);
        System.out.println("A área do Retângulo é igual à: " + df.format(areaRetangulo));

        perimetroR = 2 * (A + B);
        System.out.println("O perímetro do Retângulo é igual à: " + df.format(perimetroR));

    }

}

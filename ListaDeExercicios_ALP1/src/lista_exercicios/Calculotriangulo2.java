package lista_exercicios;

import java.util.Scanner;

public class Calculotriangulo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A, B, C;
        float n1, n2, n3;

        System.out.println("Digite o valor de A: ");
        A = entrada.nextFloat();
        System.out.println("Digite o valor de B:");
        B = entrada.nextFloat();
        System.out.println("Digite o valor de C:");
        C = entrada.nextFloat();

        if (A >= B && A >= C) {
            n1 = A;
            if (B >= C) {
                n2 = B;
                n3 = C;
            } else {
                n2 = C;
                n3 = B;
            }
            if (B >= A && B >= C) {
                n1 = B;
                if (A >= C) {
                    n2 = A;
                    n3 = C;
                } else {
                    n2 = C;
                    n3 = A;
                }
                if (C >= A && C >= B) {
                    n1 = C;
                    if (A >= B) {
                        n2 = A;
                        n3 = B;
                    } else {
                        n2 = B;
                        n3 = A;
                    }
                    if (A == B && B == C) {
                        n1 = A;
                        n2 = B;
                        n3 = C;

                    }
                    if (A >= (B + C)) {
                        System.out.println("Não Forma Triângulo!");
                    } else {
                        if ((Math.pow(A, 2)) == (Math.pow(B, 2) + Math.pow(C, 2))) {
                            System.out.println("Triângulo Retângulo");
                        } else if ((Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2)))) {
                            System.out.println("Triângulo Obtusângulo");
                        } else if ((Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2)))) {
                            System.out.println("Triângulo Acutângulo");
                        } else if (A == B && B == C) {
                            System.out.println("Triângulo Equilátero");
                        } else if (A == B && B != C || B == C && C != A || A == C && A != B) {
                            System.out.println("Triângulo Isóceles");

                        }
                    }
                }
            }
        }

    }

}

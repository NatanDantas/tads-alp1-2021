package ADO2_ALP;

import java.util.Scanner;

public class NumerosParesDefinidos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, x = 0;

        System.out.println("Digite o número: ");
        x = entrada.nextInt();

        while (i != x) {

            if (i % 2 == 1) {

                System.out.println("---------");
                System.out.println("\n" + i);

            }
            i++;
        }
    }

}

package ADO_ALP2;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, multi = 0;

        System.out.println("Digite o número: ");
        n = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            if (n > 0) {
                multi = multi * n;
                System.out.println(n + " X " + i + " = " + n * i);
            }
        }

    }

}

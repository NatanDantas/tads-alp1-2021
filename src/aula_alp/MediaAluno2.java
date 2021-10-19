package aula_alp;

import java.util.Scanner;

public class MediaAluno2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, media;
        String nomeAluno;
        char conceito;

        System.out.println("Digite o seu nome: ");
        nomeAluno = entrada.next();
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();

        media = (n1 + n2) / 2;
        System.out.println("Sua média foi de: " + media);

        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 8 && media < 9) {
            conceito = 'B';
        } else if (media >= 7 && media < 8) {
            conceito = 'C';
        } else if (media >= 6 && media < 7) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        switch (conceito) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println(nomeAluno + ", você foi aprovado, com média " + media + " e conceito " + conceito);
                break;
            default:
                System.out.println(nomeAluno + ", você foi reprovado, com média " + media + " e conceito " + conceito);

        }

    }

}

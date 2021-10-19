package lista_exercicios;

import java.util.Scanner;

public class Horadojogo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaI, horaF, duracao, duracaoH;

        System.out.println("Digite a hora incial do jogo: ");
        horaI = entrada.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        horaF = entrada.nextInt();

        int instanteI = horaI * 60;
        int instanteF = horaF * 60;

        if (instanteI < instanteF) {
            duracao = instanteF - instanteI;
        } else {
            duracao = (24 * 60 - instanteI) + instanteF;
        }
        duracaoH = duracao / 60;
        System.out.println("O jogo durou " + duracaoH + " hora (s)");
    }

}

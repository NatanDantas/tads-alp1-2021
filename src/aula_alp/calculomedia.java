package aula_alp;

import java.util.Scanner;

public class calculomedia {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nomeAluno;
        float n1, n2, media, sub;
        int presenca;
        
        System.out.println("Digite o seu nome: ");
        nomeAluno = entrada.next();
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o total de faltas: ");
        presenca = entrada.nextInt();
        
        media = (n1 + n2) /2;
        System.out.println(nomeAluno+" Sua média foi de: " + media);
       
        if(media >=6 && presenca <= 18){
            System.out.println("Você foi aprovado com média " + media);
        }else if(media< 6 && presenca > 18){
            System.out.println("Você esá reprovado por Falta e média ");
            System.out.println("Média: " + media + "\nFaltas: " + presenca);
        }else if(media <6 && presenca <=18){
            System.out.println("Você esta apto a fazer a prova substitutiva");
            System.out.println("Digite a nota da prova substitutiva: ");
            sub = entrada.nextFloat();
            if(sub > media && sub >= 6){
                System.out.println("Aprovado pela sub, com média " + sub);
            }else{
                System.out.println("Reprovado!");
            }
        }
        
                
    }
    
}

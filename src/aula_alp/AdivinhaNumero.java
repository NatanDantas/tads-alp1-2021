package aula_alp;

import java.util.Scanner;

public class AdivinhaNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Número: ");
        n = entrada.nextInt();
        
        if (n > 0){
            System.out.println(n + " é positivo");
        }else if(n < 0){
            System.out.println(n + " é negativo");
        }else{
            System.out.println(n + " é zero");
        }
        
        
        if (n == 1){
            System.out.println("Você digitou o número 1 !");
        }else if(n == 2){
            System.out.println("Você digitou o número 2 !");
        }else if(n == 3){
            System.out.println("Você digitou o número 3 !");
        }else if(n == 4){
            System.out.println("Você digitou o número 4 !");
        }else if(n == 5){
            System.out.println("Você digitou o número 5 !");
        }else{
            System.out.println("Número inválido !");
        }
    }

}

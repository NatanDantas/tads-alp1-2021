package aula_alp;

import java.util.Scanner;

/**
 *
 * @author jsda2
 */
public class ex1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    
    float n1, n2, divisao;
    
        System.out.println("Digite o primeiro número a ser dividido:");
        n1 = entrada.nextFloat();
        System.out.println("Digite o segundo número a ser dividido:");
        n2  =  entrada.nextFloat();
        
        divisao = n1/n2;
        
        System.out.println("O resultado desta divisão é igual a: " + divisao);
    }
    
    
       
}

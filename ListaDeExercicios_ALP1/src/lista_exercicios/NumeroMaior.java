
package lista_exercicios;

import java.util.Scanner;


public class NumeroMaior {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = entrada.nextInt();
        
        if (n1 > n2 ){
            int maior = n1;
            System.out.println("O maior número é: " + maior);
        }else if(n3 > n1){
            int maior = n3;
             System.out.println("O maior número é: " + maior);
        }else{
            int maior = n2;
            System.out.println("O maior número é: " + maior);
        }
    }
    
}

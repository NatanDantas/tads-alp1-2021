
package aula_alp;

import java.util.Scanner;

public class ExemploDoWhile4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        boolean teste = true;
        
        while(teste){
            System.out.println("i: " + i);
            i++;
            if(i>100){
                System.out.println("Dentro do IF");
                teste = false;
            }
        }
    }
    
}

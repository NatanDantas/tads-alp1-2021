
package aula_alp;

import java.util.Scanner;

/**
 *
 * @author jsda2
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
     double n1, n2, inverso1, inverso2;
     
        System.out.println("Digite o primeiro número:");
        n1 =  entrada.nextDouble();
        System.out.println("Digite o segundo número");
        n2 = entrada.nextDouble();
        
        inverso1 = (n1 = n2);
        inverso2 = (n2 = n1);
        
        System.out.println("Os dois números invertidos são respectivamente: " + inverso1 + " e " + inverso2);
    }
}

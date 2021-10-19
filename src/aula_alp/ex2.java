
package aula_alp;

import java.util.Scanner;

/**
 *
 * @author jsda2
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int idade, futuro;
        
        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();
        
        futuro = idade + 20;
        
        System.out.println("Daqui a vinte anos, você terá " + futuro + " anos");
    }
}

package aula_alp;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          char grade;
           
          
          System.out.println("Digite a sua grade: ");
          grade = entrada.next().charAt(0);
          
          
          switch (grade){
              case 'A' :
                  System.out.println("Excelente !");
                  break;
              case 'B' :
              case 'C' :
                  System.out.println("Bem Feito !");
                   break;
              case 'D' :
                  System.out.println("Você passou !");
                  break;
              case 'E' :
                  System.out.println("Melhor tentar novamente !");
                  break;
              default :
                  System.out.println("Conceito Inválido!!");
                  
                  
          }
    }

}

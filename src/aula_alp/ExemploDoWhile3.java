package aula_alp;

import java.util.Scanner;

public class ExemploDoWhile3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario, user = "Teste";
        int senha, pwd = 123;

        do {
            System.out.println("Login: ");
            usuario = entrada.next();
            System.out.println("Senha: ");
            senha = entrada.nextInt();
            if (usuario.equals(user) && senha == pwd) {
                System.out.println("Login Efetuado Com Sucesso!");
                break;
            } else {
                System.out.println("Tente novamente");
            }

        } while (!usuario.equals(user) || senha != pwd);
    }

}

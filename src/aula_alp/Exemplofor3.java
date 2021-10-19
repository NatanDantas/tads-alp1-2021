package aula_alp;

import java.util.Scanner;

public class Exemplofor3 {

    public static void main(String[] args) {
        //dados armazenados para serem validados.
        Scanner entrada = new Scanner(System.in);
        String user = "Teste123";
        int pwd = 123;

        //dados informados pelo usuário
        String usuario;
        int senha, contador = 2;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuário: ");
            usuario = entrada.next();
            System.out.println("Senha: ");
            senha = entrada.nextInt();

            if (usuario.equals(user) && senha == pwd) {
                System.out.println("Login efetuado com sucesso!");
                break;
            } else {
                System.out.println("Tente Novamente!");
                System.out.println("Você ainda tem " + contador-- + " tentativas");
            }
        }
    }

}

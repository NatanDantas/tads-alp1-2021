package lista_exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Cadastro_funcionario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cad, horat, valorh, salario;

        System.out.println("Informe o número do cadastro: ");
        cad = entrada.nextFloat();
        System.out.println("Informe o número de horas trabalhadas: ");
        horat = entrada.nextFloat();
        System.out.println("Informe o valor recebido por horas trabalhadas: ");
        valorh = entrada.nextFloat();

        salario = valorh * horat;
        System.out.println(cad + ", Você irá receber: " + NumberFormat.getCurrencyInstance().format(salario) + " neste mês");

    }

}

package lista_exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Comissao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeFuncionario;
        float salario, vendasEf, comissao, salarioTotal;

        System.out.println("Digite o seu nome: ");
        nomeFuncionario = entrada.nextLine();
        System.out.println("Digite o seu salário fixo: ");
        salario = entrada.nextFloat();
        System.out.println("Digite o total de vendas efetuadas em reais: ");
        vendasEf = entrada.nextFloat();

        comissao = vendasEf * 15;
        salarioTotal = comissao + salario;
        System.out.println(nomeFuncionario + ", Sua comissão foi de " + comissao + ", Totalizando um salário de: " + NumberFormat.getCurrencyInstance().format(salarioTotal));

    }

}

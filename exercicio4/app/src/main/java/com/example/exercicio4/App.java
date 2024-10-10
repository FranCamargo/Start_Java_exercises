package com.example.exercicio4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Vendedor:");
        String nome = scanner.next();

        System.out.println("Informe o salario fixo:");
        float salariofx = scanner.nextFloat();
        
        System.out.println("Informe o valor total das vendas: ");
        float vendas = scanner.nextFloat();

        float comissao = (float) (vendas * 0.15); //calcula comissão sobre salário//
        float slmensal = (comissao + salariofx);
        System.out.println("Obrigado. Veja abaixo o resultado mensal");
        System.out.println("O salario mensal do vendedor " + nome + " sera de: " + slmensal + ".");
    }
}

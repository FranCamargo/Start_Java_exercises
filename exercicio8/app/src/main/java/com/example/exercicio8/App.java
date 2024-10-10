package com.example.exercicio8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR DOLAR PARA REAL");
        System.out.println("=========================");
        System.out.println("Informe a cotacao do USD/R$ de hoje");
        float cotacao = scanner.nextFloat();

        System.out.println("Informe a quantia em USD que vc possui");
        float qtdolar = scanner.nextFloat();

        float real;
        real = (qtdolar*cotacao);
        
        System.out.println("Baseado na cotacao informada, vc possui R$"+real+".");
        
    }
}

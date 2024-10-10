package com.example.Exercicio10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto em R$");
        float vProduto = scanner.nextFloat();

        int qtParcela = 5;
        System.out.println("==================================");
        float vParcela = (vProduto / qtParcela);
        System.out.println("Confira abaixo o valor das prestacoes");
        System.out.println("P1: R$" + vParcela);
        System.out.println("P2: R$" + vParcela);
        System.out.println("P3: R$" + vParcela);
        System.out.println("P4: R$" + vParcela);
        System.out.println("P5: R$" + vParcela);

    }
}

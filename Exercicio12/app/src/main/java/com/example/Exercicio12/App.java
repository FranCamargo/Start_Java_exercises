package com.example.Exercicio12;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo de fabrica");
        float cfabrica = scanner.nextFloat();

        float vcomimpostos = (0.45f * cfabrica) + cfabrica;

        float vfinal = (0.28f * vcomimpostos) + vcomimpostos;
                
        System.out.println("O custo total do carro sera de R$" + vfinal);
        
        scanner.close();
    }
}

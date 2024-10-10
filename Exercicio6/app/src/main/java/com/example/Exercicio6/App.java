package com.example.Exercicio6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Informe o valor de B:");
        int b = scanner.nextInt();

        int temp;
        temp = (a);
        a = (b);
        b = (temp);

        System.out.println("Valores trocados com sucesso!");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}

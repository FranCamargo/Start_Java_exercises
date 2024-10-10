package com.example.Exercicio14;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();

        boolean op1 = n1 > n2;

        if (op1) {

            System.out.println(n1 + " e maior que " + n2);
        } else {
            System.out.println(n2 + " e maior que " + n1);

        }
    }}

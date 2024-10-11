package com.example.Exercicio20;

/* Exercício: Uma concessionária está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral; */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float vDesconto;
        int totalCarrosNovos = 0;
        int totalCarros = 0;

        char desejaRepetir = 's';
        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Informe o ano do carro");
            int anoCarro = scanner.nextInt();

            System.out.println("Informe o valor do carro");
            float vCarro = scanner.nextFloat();

            if (anoCarro > 2000) {

                vDesconto = (float) (vCarro * 0.07);
                totalCarrosNovos++;
            } else {
                vDesconto = (float) (vCarro * 0.12);

            }
            float vTotal = (vCarro - vDesconto);

            totalCarros++;

            System.out.println("O valor do carro com desconto aplicado sera de R$" + vTotal);

            System.out.println("Deseja verificar outro carro? - S ou N?");
            desejaRepetir = scanner.next().charAt(0);
        }
        System.out.println("Qtd de carros cadastrados:" + totalCarros);
        System.out.println("Qtd de carros fabricados acima de 2000: " + totalCarrosNovos);

    }
}

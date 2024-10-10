package com.example.exercicio7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor Celsius para Farenheit");
        System.out.println("=================================");

        System.out.println("Digite a temperatura em C");
        float tempc = scanner.nextFloat();
        
        float farenheit;
        farenheit = (((9 * tempc) + 160) / 5);
        
        System.out.println("Temperatura convertida para Farenheit: "+farenheit+"F");

    }
}

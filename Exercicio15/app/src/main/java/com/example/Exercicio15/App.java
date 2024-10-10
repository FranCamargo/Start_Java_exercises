package com.example.Exercicio15;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n1 = scanner.nextInt();
       
        
        if (n1 < 100 || n1 > 200){
            System.out.println("Nao esta entre 100 e 200");
    }
        else{
            System.out.println("Esta entre 100 e 200");
   
                }
        
}}

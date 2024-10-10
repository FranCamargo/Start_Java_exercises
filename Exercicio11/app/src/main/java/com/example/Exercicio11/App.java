package com.example.Exercicio11;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor do produto");
        float vProduto = scanner.nextFloat();
        
        System.out.println("Informe o valor percentual do acrescimo");
        float vAcr = scanner.nextFloat();
        
        float conversaoperc = (vAcr /100); // converte acréscimo % para decimal
        
        float vacresc = (vProduto * conversaoperc);
        
        float vfinal = (vProduto + vacresc);
        
        System.out.println("Apos o acrescimo o valor sera de R$"+vfinal);
       
        scanner.close();
    }
}

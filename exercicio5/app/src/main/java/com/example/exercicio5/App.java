package com.example.exercicio5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Informe o nome do aluno(a):");
         String aluno = scanner.next();
         
         System.out.println("Informe a primeira nota:");
         int nota1 = scanner.nextInt();
         
         System.out.println("Informe a segunda nota:");
         int nota2 = scanner.nextInt();
         
         System.out.println("Informe a terceira nota:");
         int nota3 = scanner.nextInt();
         
        float media = ((nota1 + nota2 + nota3)/3);      
                
          System.out.println("O aluno(a)"+aluno+" obteve media: "+media);
    }
    }

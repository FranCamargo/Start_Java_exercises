package com.example.Exercicio9;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe valor depositado");
        float vdepositado = scanner.nextFloat();
        
        float juros;
        juros = (float)(vdepositado * 0.0007);
        float vfinal = (vdepositado + juros);
        
        System.out.println("Com juros de 0,07%a.m, o valor apos 30 dias sera: R$"+vfinal);
    }
}

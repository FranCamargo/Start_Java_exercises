package com.example.Arraytest;

public class App {

    public static void main(String[] args) {
        //declaração de Array
        String[] paises = new String[5];
        
        //Inicializando o Array
        paises[0] = "Brasil";
        paises[1] = "Chile";
        paises[2] = "Peru";
        paises[3] = "Argentina";
        paises[4] = "Uruguai";      
       
        //Imprimindo todos os itens do Array
        for (String Nomequalquer: paises){
            System.out.println(Nomequalquer);
        }
    }
}

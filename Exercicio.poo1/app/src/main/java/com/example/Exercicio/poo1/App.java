package com.example.Exercicio.poo1;

/*Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.  */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Definindo o formato de data

            while (desejaContinuar == 1) {
                Pessoa p = new Pessoa();

                // Capturando o nome
                System.out.println("Digite o nome:");
                p.setNome(scanner.next());

                // Capturando a data de nascimento
                System.out.println("Digite a data de nascimento (dd/MM/yyyy):");
                String dataEntrada = scanner.next();  // Captura a data como string

                try {
                    // Convertendo a string para LocalDate
                    LocalDate dataNascimento = LocalDate.parse(dataEntrada, formato);
                    p.setDatanasc(dataNascimento);  

                    // Calculando a idade
                    int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

                } catch (DateTimeParseException e) {  // Pega o erro caso a data inserida esteja em um formato inválido
                    System.out.println("Data no formato inválido! Use o formato dd/MM/yyyy.");
                    continue;  // Se a data for inválida, volta ao início do loop
                }

                // Capturando a altura
                System.out.println("Digite a altura:");
                p.setAltura(scanner.nextFloat());

                pessoas.add(p);

                // Perguntando se o usuário deseja continuar
                System.out.println("Deseja continuar? 1 - Sim, 2 - Não");
                desejaContinuar = scanner.nextInt();
            }

            // Exibindo os dados das pessoas após a saída do loop e sua idade atual e não mais a data de nascimento.
            System.out.println("\nDados das pessoas inseridas:");
            for (Pessoa pessoa : pessoas) {
                // Para cada pessoa, exibe os dados
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.calcularIdade() + " anos");  // Chamando o método calcularIdade()
                System.out.println("Altura: " + pessoa.getAltura());
                System.out.println("--------------------------");  // Separador entre pessoas
            }
        }
    }
}

package com.example.Exercicio.poo1;

import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    private String nome;
    private LocalDate dataNasc;
    private float altura;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanasc() {
        return dataNasc;
    }

    public void setDatanasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
        
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método para calcular a idade
    public int calcularIdade() {
        return Period.between(this.dataNasc, LocalDate.now()).getYears();
    }
}
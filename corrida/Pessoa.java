package com.mycompany.corrida;

public class Pessoa {

    private String nome;

    public Pessoa(String inserirNome) {
        this.nome = inserirNome;
    }

    public void setNome(String inserirNome) {
        this.nome = inserirNome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome;
    }
}

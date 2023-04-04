package com.mycompany.corrida;

public class Passageiro extends Pessoa {

    public Passageiro(String inserirNome) {
        super(inserirNome);
    }

    public boolean solicitarCorrida(int variavel) {
        if (variavel == 1) {
            return true;
        }
        return false;
    }
}

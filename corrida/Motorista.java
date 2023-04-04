package com.mycompany.corrida;

public class Motorista extends Pessoa {

    private int saldo;
    private int nota;

    public Motorista(String inserirNome) {
        super(inserirNome);
    }

    public double aceitarCorrida(double x1, double x2, double y1, double y2) {
        double distancia;

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return Math.abs(distancia);
    }
}

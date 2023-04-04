package com.mycompany.corrida;

import java.util.Scanner;

public class Corrida {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int escolha;
        double x1, x2, y1, y2;
        double resultado, resultado2;
        String nome;

        System.out.print("Informe o seu nome: ");
        nome = in.nextLine();
        System.out.print("Olá " + nome + ", gostaria de solicitar uma corrida(Digite (1) para SIM ou (2) para NÃO? ");
        escolha = in.nextInt();
        while (escolha != 1 && escolha != 2) {
            System.out.print("Opção inválida, digite novamente: ");
            escolha = in.nextInt();
        }
        Passageiro p1 = new Passageiro(nome);
        if (p1.solicitarCorrida(escolha)) {
            System.out.println("Informe os valores das variáveis para o cálculo da distância");
            System.out.print("Informe o valor de x1: ");
            x1 = in.nextDouble();
            System.out.print("Informe o valor de x2: ");
            x2 = in.nextDouble();
            System.out.print("Informe o valor de y1: ");
            y1 = in.nextDouble();
            System.out.print("Informe o valor de y2: ");
            y2 = in.nextDouble();

            Motorista m1 = new Motorista("João");
            Motorista m2 = new Motorista("Felipe");
            resultado = m1.aceitarCorrida(x1, x2, y1, y2);
            resultado2 = m2.aceitarCorrida(x1, x2, y1, y2);

            if (resultado < resultado2) {
                System.out.println("Seu motorista, " + m1.toString() + ", está a " + resultado + " metros.");
            } else if (resultado2 < resultado) {
                System.out.println("Seu motorista, " + m2.toString() + ", está a " + resultado2 + " metros.");
            }
        } else {
            System.out.println(p1.toString() + " não deseja solicitar uma corrida.");
        }

        System.out.println("Programa encerrado!");

    }
}

package Aplicacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nome, sobrenome, cpf;
        char resp;
        System.out.println("Informe seu nome: ");
        nome = in.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = in.next();
        System.out.println("Informe seu CPF: ");
        cpf = in.next();
    }
}

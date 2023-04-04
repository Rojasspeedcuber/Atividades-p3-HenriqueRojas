package com.mycompany.cadastro;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] lista = new String[1][2];
        CadastroPessoas pessoa = new CadastroPessoas(lista);
        int opcao;
        do {
            System.out.println("Menu de opções: ");
            System.out.println("1 - Novo cadastro");
            System.out.println("2 - Buscar telefone cadastrado");
            System.out.println("0 - Encerrar programa");
            System.out.print("Informe a opção desejada: ");
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    novoCadastro(lista);
                    
            }
        } while (opcao != 0);
    }

    public static String[][] aumentarTamanho(String[][] lista) {
        String[][] matriz = new String[lista.length + 1][2];
        return matriz;
    }

    public static void novoCadastro(String[][] lista) {
        Scanner in = new Scanner(System.in);
        String[][] matriz;
        char resp;
        int i, j, m, n;
        for (i = 0; i < lista.length; i++) {
            for (j = 0; j < lista[i].length; j++) {
                System.out.println("Informe o nome da pessoa: ");
                lista[i][j] = in.next();
                System.out.println("Informe o telefone da pessoa: ");
                lista[i][j + 1] = in.next();
                System.out.println("Deseja cadastrar mais alguém(digite s para sim ou n para não)? ");
                resp = in.next().charAt(0);
                if (resp == 's') {
                    matriz = aumentarTamanho(lista);
                    for (m = 0; m < matriz.length; m++) {
                        for (n = 0; n < matriz[m].length; n++) {
                            System.out.println("Informe o nome da pessoa: ");
                            lista[i][j] = in.next();
                            System.out.println("Informe o telefone da pessoa: ");
                            lista[i][j + 1] = in.next();
                            System.out.println("Deseja cadastrar mais alguém(digite s para sim ou n para não)? ");
                            resp = in.next().charAt(0);
                            if (resp == 's') {
                                matriz = aumentarTamanho(lista);
                            }
                        }
                    }
                }
            }
        }
    }
}

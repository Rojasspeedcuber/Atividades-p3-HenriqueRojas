
package com.mycompany.cadastro;

public class CadastroPessoas {
    private String[][] lista;
    
    public CadastroPessoas(String[][] lista){
        this.lista = lista;
    }
    
    public String obterTelefone(String[][] lista, String nome){
        int resultado;
        resultado = buscarPessoa(lista, nome);
        if (resultado == -1){
            return "Cadastro não encontrada";
        }
        return lista[resultado][1];
    }
    
    public int buscarPessoa(String[][] lista, String nome){
        int i, j;
        for (i = 0; i < lista.length; i++){
            for (j = 0; j < lista[i].length; j++){
                if(lista[i][j].compareToIgnoreCase(nome) == 0){
                    return i;
                }
            }
        }
        return -1;
    }
    
}
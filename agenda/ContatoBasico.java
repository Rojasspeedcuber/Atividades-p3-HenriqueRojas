/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

import java.util.ArrayList;

/**
 *
 * @author Moreno
 */
abstract public class ContatoBasico {

    protected String nome;
    protected ArrayList<Telefone> telefones;

    public ContatoBasico() {
        nome = "";
        telefones = new ArrayList();
    }

    public ContatoBasico(String nome) {
        this.nome = nome;
        telefones = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone tf) {
        telefones.add(tf);
    }

    public String getDados() {
        String s = nome + "\n";
        for (Telefone t : telefones) {
            s += t.getTelefone() + "\n";
        }
        return s;
    }
}

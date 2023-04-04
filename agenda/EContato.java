/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

import java.util.Calendar;

/**
 *
 * @author Moreno
 */
public class EContato extends Contato {

    protected String email, homepage;

    public EContato(String nome, Calendar dtnasc, String email, String hp) {
        super(nome, dtnasc);
        this.email = email;
        homepage = hp;
    }

    @Override
    public String getDados() {
        return super.getDados() + "email: " + email + "\nhomepage: " + homepage + "\nData de nascimento: " + dtnasc;
    }

    public String getEmail() {
        return email;
    }

    public String getHomepage() {
        return homepage;
    }

}

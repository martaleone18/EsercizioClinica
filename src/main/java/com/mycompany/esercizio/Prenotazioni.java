/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Prenotazioni {

   
    public String NomePaziente;
    public Date data;
    Specialista s;

    public Prenotazioni(String NomePaziente, Date data, Specialista s) {
        this.NomePaziente = NomePaziente;
        this.data = data;
        this.s = s;
    }

    public String getNomePaziente() {
        return NomePaziente;
    }

    public void setNomePaziente(String NomePaziente) {
        this.NomePaziente = NomePaziente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Specialista getS() {
        return s;
    }

    public void setS(Specialista s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" + "NomePaziente=" + NomePaziente + ", data=" + data + ", s=" + s + '}';
    }
    
    
    
    
    
}
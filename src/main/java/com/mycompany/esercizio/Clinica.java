/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author marta
 */
public class Clinica {

    public ArrayList<Prenotazioni> prenotazioni = new ArrayList<>();

    Collection<String> listaOcul = new ArrayList<>();
    Collection<String> listaPed = new ArrayList<>();

  //  public Prenotazioni Prenota(Specialista s, String Nomepaziente) {
        // in base allo specialista s e al nome del paziente che sono gli ingredienti
        // posso generare una data (ingrediente)
        // in base a questi ingredienti io devo generare un oggetto prenotazione
        // allora creo un Arraylist inizialmente null e poi devo tenere conto se
        // l'elemento
        // si trova già sulla lista allora non lo devo inserire
        // alla fine nella mia RETURN devo avere un'oggetto prenotazione

 //   }

    public void CancellaPrenotazione(Specialista s, String Nomepaziente) {
        // in base a specialista nome e cogome paziente cerco nella lista l'elemento
        // che corrisponde e se lo trovo lo tolgo
        // e se questo elemento non lo trovo genero eccezione

    }

   // public Collection<String> GetPrenotati(Specialista s) {
       
        //creo nella classe clinica nella parte di variabili private una lista di String
        //faccio un ciclo for seguito da un if (se la prenotazione p.specialista.equals(s))
        // for (Prenotazioni p : prenotazioni) {
        //   if (p.getS().equals(s)) {
        //     listaOcul.addAll(p);
        //   return listaOcul;
        //} else {
        //   listaPed.add(p);

           // }

       // }
             //       return listaPed;

    }
    



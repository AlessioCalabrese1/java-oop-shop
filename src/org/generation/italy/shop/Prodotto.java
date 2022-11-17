package org.generation.italy.shop;

import java.util.Random;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    int prezzo;
    int iva = 20;

    public Prodotto(String nome, String descrizione, int prezzo){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        Random rnd = new Random();
        this.codice = rnd.nextInt(10000);
    }

    int getPrezzo(){
        return prezzo;
    }

    float getPrezzoIva(){
        return prezzo + ((prezzo*iva)/100);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome Prodotto: " + nome + "\nDescrizione: " + descrizione + "\nPrezzo: " + getPrezzo() + "Prezzo con Iva: " + 
        getPrezzoIva() + "\nCodice prodotto: " + codice;
    }
}

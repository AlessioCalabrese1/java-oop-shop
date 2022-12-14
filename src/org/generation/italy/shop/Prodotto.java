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
        String code = "";
        for (int i = 0; i < 5; i++) {
            code += Integer.toString(rnd.nextInt(9)) ;
        }
        this.codice = Integer.parseInt(code);
    }

    int getPrezzo(){
        return prezzo;
    }

    float getPrezzoIva(){
        return prezzo + ((prezzo*iva)/100);
    }

    @Override
    public String toString() {
        return "Nome Prodotto: " + nome + "\nDescrizione: " + descrizione + "\nPrezzo: " + getPrezzo() + "$\nPrezzo con Iva: " + 
        getPrezzoIva() + "$\nCodice prodotto: " + codice;
    }
}

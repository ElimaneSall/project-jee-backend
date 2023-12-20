package com.example.ventevelo.model.vente;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ArticleCommandePK implements Serializable {
    @Column(name = "NUMERO_COMMANDE", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCommande;
    @Column(name = "LIGNE", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ligne;

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommandePK that = (ArticleCommandePK) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        return result;
    }
}

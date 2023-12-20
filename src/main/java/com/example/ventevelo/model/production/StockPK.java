package com.example.ventevelo.model.production;

import javax.persistence.*;

import java.io.Serializable;

public class StockPK implements Serializable {
    @Column(name = "MAGASIN_ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int magasinId;
    @Column(name = "PRODUIT_ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int produitId;

    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockPK stockPK = (StockPK) o;

        if (magasinId != stockPK.magasinId) return false;
        if (produitId != stockPK.produitId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = magasinId;
        result = 31 * result + produitId;
        return result;
    }
}

package com.example.ventevelo.model.production;

import javax.persistence.*;

@Entity
@IdClass(StockPK.class)
public class Stock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MAGASIN_ID", nullable = false)
    private int magasinId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUIT_ID", nullable = false)
    private int produitId;
    @Basic
    @Column(name = "QUANTITE", nullable = false)
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "PRODUIT_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Produit produitByProduitId;

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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (magasinId != stock.magasinId) return false;
        if (produitId != stock.produitId) return false;
        if (quantite != stock.quantite) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = magasinId;
        result = 31 * result + produitId;
        result = 31 * result + quantite;
        return result;
    }

    public Produit getProduitByProduitId() {
        return produitByProduitId;
    }

    public void setProduitByProduitId(Produit produitByProduitId) {
        this.produitByProduitId = produitByProduitId;
    }
}

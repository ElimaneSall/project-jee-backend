package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "article_commande", schema = "vente", catalog = "")
@IdClass(ArticleCommandePK.class)
public class ArticleCommande {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMERO_COMMANDE", nullable = false)
    private int numeroCommande;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LIGNE", nullable = false)
    private int ligne;
    @Basic
    @Column(name = "PRODUIT_ID", nullable = false)
    private int produitId;
    @Basic
    @Column(name = "QUANTITE", nullable = false)
    private int quantite;
    @Basic
    @Column(name = "PRIX_DEPART", nullable = false, precision = 2)
    private BigDecimal prixDepart;
    @Basic
    @Column(name = "REMISE", nullable = false, precision = 2)
    private BigDecimal remise;
    @ManyToOne
    @JoinColumn(name = "NUMERO_COMMANDE", referencedColumnName = "NUMERO", nullable = false)
    private Commande commandeByNumeroCommande;

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

    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommande that = (ArticleCommande) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;
        if (produitId != that.produitId) return false;
        if (quantite != that.quantite) return false;
        if (prixDepart != null ? !prixDepart.equals(that.prixDepart) : that.prixDepart != null) return false;
        if (remise != null ? !remise.equals(that.remise) : that.remise != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        result = 31 * result + produitId;
        result = 31 * result + quantite;
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        result = 31 * result + (remise != null ? remise.hashCode() : 0);
        return result;
    }

    public Commande getCommandeByNumeroCommande() {
        return commandeByNumeroCommande;
    }

    public void setCommandeByNumeroCommande(Commande commandeByNumeroCommande) {
        this.commandeByNumeroCommande = commandeByNumeroCommande;
    }
}

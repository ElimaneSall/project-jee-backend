package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
public class Commande {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMERO", nullable = false)
    private int numero;
    @Basic
    @Column(name = "CLIENT_ID", nullable = true)
    private Integer clientId;
    @Basic
    @Column(name = "STATUT", nullable = false)
    private byte statut;
    @Basic
    @Column(name = "DATE_COMMANDE", nullable = false)
    private Date dateCommande;
    @Basic
    @Column(name = "DATE_LIVRAISON_VOULUE", nullable = false)
    private Date dateLivraisonVoulue;
    @Basic
    @Column(name = "DATE_LIVRAISON", nullable = true)
    private Date dateLivraison;
    @Basic
    @Column(name = "MAGASIN_ID", nullable = false)
    private int magasinId;
    @Basic
    @Column(name = "VENDEUR_ID", nullable = false)
    private int vendeurId;
    @OneToMany(mappedBy = "commandeByNumeroCommande")
    private Collection<ArticleCommande> articleCommandesByNumero;
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID")
    private Client clientByClientId;
    @ManyToOne
    @JoinColumn(name = "MAGASIN_ID", referencedColumnName = "ID", nullable = false)
    private Magasin magasinByMagasinId;
    @ManyToOne
    @JoinColumn(name = "VENDEUR_ID", referencedColumnName = "ID", nullable = false)
    private Employe employeByVendeurId;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public byte getStatut() {
        return statut;
    }

    public void setStatut(byte statut) {
        this.statut = statut;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Date getDateLivraisonVoulue() {
        return dateLivraisonVoulue;
    }

    public void setDateLivraisonVoulue(Date dateLivraisonVoulue) {
        this.dateLivraisonVoulue = dateLivraisonVoulue;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    public int getVendeurId() {
        return vendeurId;
    }

    public void setVendeurId(int vendeurId) {
        this.vendeurId = vendeurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commande commande = (Commande) o;

        if (numero != commande.numero) return false;
        if (statut != commande.statut) return false;
        if (magasinId != commande.magasinId) return false;
        if (vendeurId != commande.vendeurId) return false;
        if (clientId != null ? !clientId.equals(commande.clientId) : commande.clientId != null) return false;
        if (dateCommande != null ? !dateCommande.equals(commande.dateCommande) : commande.dateCommande != null)
            return false;
        if (dateLivraisonVoulue != null ? !dateLivraisonVoulue.equals(commande.dateLivraisonVoulue) : commande.dateLivraisonVoulue != null)
            return false;
        if (dateLivraison != null ? !dateLivraison.equals(commande.dateLivraison) : commande.dateLivraison != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (int) statut;
        result = 31 * result + (dateCommande != null ? dateCommande.hashCode() : 0);
        result = 31 * result + (dateLivraisonVoulue != null ? dateLivraisonVoulue.hashCode() : 0);
        result = 31 * result + (dateLivraison != null ? dateLivraison.hashCode() : 0);
        result = 31 * result + magasinId;
        result = 31 * result + vendeurId;
        return result;
    }

    public Collection<ArticleCommande> getArticleCommandesByNumero() {
        return articleCommandesByNumero;
    }

    public void setArticleCommandesByNumero(Collection<ArticleCommande> articleCommandesByNumero) {
        this.articleCommandesByNumero = articleCommandesByNumero;
    }

    public Client getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(Client clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    public Magasin getMagasinByMagasinId() {
        return magasinByMagasinId;
    }

    public void setMagasinByMagasinId(Magasin magasinByMagasinId) {
        this.magasinByMagasinId = magasinByMagasinId;
    }

    public Employe getEmployeByVendeurId() {
        return employeByVendeurId;
    }

    public void setEmployeByVendeurId(Employe employeByVendeurId) {
        this.employeByVendeurId = employeByVendeurId;
    }
}

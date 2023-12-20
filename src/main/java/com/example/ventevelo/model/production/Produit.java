package com.example.ventevelo.model.production;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "NOM", nullable = false, length = 255)
    private String nom;
    @Basic
    @Column(name = "MARQUE_ID", nullable = false)
    private int marqueId;
    @Basic
    @Column(name = "CATEGORIE_ID", nullable = false)
    private int categorieId;
    @Basic
    @Column(name = "ANNEE_MODEL", nullable = false)
    private short anneeModel;
    @Basic
    @Column(name = "PRIX_DEPART", nullable = false, precision = 2)
    private BigDecimal prixDepart;
    @ManyToOne
    @JoinColumn(name = "MARQUE_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Marque marqueByMarqueId;
    @ManyToOne
    @JoinColumn(name = "CATEGORIE_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Categorie categorieByCategorieId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(int marqueId) {
        this.marqueId = marqueId;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(short anneeModel) {
        this.anneeModel = anneeModel;
    }

    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        if (id != produit.id) return false;
        if (marqueId != produit.marqueId) return false;
        if (categorieId != produit.categorieId) return false;
        if (anneeModel != produit.anneeModel) return false;
        if (nom != null ? !nom.equals(produit.nom) : produit.nom != null) return false;
        if (prixDepart != null ? !prixDepart.equals(produit.prixDepart) : produit.prixDepart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + marqueId;
        result = 31 * result + categorieId;
        result = 31 * result + (int) anneeModel;
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        return result;
    }

    public Marque getMarqueByMarqueId() {
        return marqueByMarqueId;
    }

    public void setMarqueByMarqueId(Marque marqueByMarqueId) {
        this.marqueByMarqueId = marqueByMarqueId;
    }

    public Categorie getCategorieByCategorieId() {
        return categorieByCategorieId;
    }

    public void setCategorieByCategorieId(Categorie categorieByCategorieId) {
        this.categorieByCategorieId = categorieByCategorieId;
    }
}

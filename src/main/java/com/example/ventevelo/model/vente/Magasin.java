package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Magasin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "NOM", nullable = false, length = 255)
    private String nom;
    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 25)
    private String telephone;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "ADRESSE", nullable = true, length = 255)
    private String adresse;
    @Basic
    @Column(name = "VILLE", nullable = true, length = 255)
    private String ville;
    @Basic
    @Column(name = "ETAT", nullable = true, length = 25)
    private String etat;
    @Basic
    @Column(name = "CODE_ZIP", nullable = true, length = 5)
    private String codeZip;
    @OneToMany(mappedBy = "magasinByMagasinId")
    private Collection<Commande> commandesById;
    @OneToMany(mappedBy = "magasinByMagasinId")
    private Collection<Employe> employesById;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magasin magasin = (Magasin) o;

        if (id != magasin.id) return false;
        if (nom != null ? !nom.equals(magasin.nom) : magasin.nom != null) return false;
        if (telephone != null ? !telephone.equals(magasin.telephone) : magasin.telephone != null) return false;
        if (email != null ? !email.equals(magasin.email) : magasin.email != null) return false;
        if (adresse != null ? !adresse.equals(magasin.adresse) : magasin.adresse != null) return false;
        if (ville != null ? !ville.equals(magasin.ville) : magasin.ville != null) return false;
        if (etat != null ? !etat.equals(magasin.etat) : magasin.etat != null) return false;
        if (codeZip != null ? !codeZip.equals(magasin.codeZip) : magasin.codeZip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (codeZip != null ? codeZip.hashCode() : 0);
        return result;
    }

    public Collection<Commande> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<Commande> commandesById) {
        this.commandesById = commandesById;
    }

    public Collection<Employe> getEmployesById() {
        return employesById;
    }

    public void setEmployesById(Collection<Employe> employesById) {
        this.employesById = employesById;
    }
}

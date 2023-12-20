package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Client extends Personne {

    @Basic
    @Column(name = "ADRESSE", nullable = true, length = 255)
    private String adresse;
    @Basic
    @Column(name = "VILLE", nullable = true, length = 50)
    private String ville;
    @Basic
    @Column(name = "ETAT", nullable = true, length = 25)
    private String etat;
    @Basic
    @Column(name = "CODE_ZIP", nullable = true, length = 5)
    private String codeZip;
    @OneToMany(mappedBy = "clientByClientId")
    private Collection<Commande> commandesById;

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



    public Collection<Commande> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<Commande> commandesById) {
        this.commandesById = commandesById;
    }
}

package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;
    @Basic
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;
    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 25)
    private String telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (id != personne.id) return false;
        if (prenom != null ? !prenom.equals(personne.prenom) : personne.prenom != null) return false;
        if (nom != null ? !nom.equals(personne.nom) : personne.nom != null) return false;
        if (telephone != null ? !telephone.equals(personne.telephone) : personne.telephone != null) return false;
        if (email != null ? !email.equals(personne.email) : personne.email != null) return false;
//        if (adresse != null ? !adresse.equals(client.adresse) : client.adresse != null) return false;
//        if (ville != null ? !ville.equals(client.ville) : client.ville != null) return false;
//        if (etat != null ? !etat.equals(client.etat) : client.etat != null) return false;
//        if (codeZip != null ? !codeZip.equals(client.codeZip) : client.codeZip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
//        result = 31 * result + (ville != null ? ville.hashCode() : 0);
//        result = 31 * result + (etat != null ? etat.hashCode() : 0);
//        result = 31 * result + (codeZip != null ? codeZip.hashCode() : 0);
        return result;
    }
}

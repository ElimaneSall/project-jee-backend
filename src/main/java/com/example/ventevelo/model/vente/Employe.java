package com.example.ventevelo.model.vente;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Employe extends  Personne {
    @Basic
    @Column(name = "ACTIF", nullable = false)
    private byte actif;
    @Basic
    @Column(name = "MAGASIN_ID", nullable = false)
    private int magasinId;
    @Basic
    @Column(name = "MANAGER_ID", nullable = true)
    private Integer managerId;
    @OneToMany(mappedBy = "employeByVendeurId")
    private Collection<Commande> commandesById;
    @ManyToOne
    @JoinColumn(name = "MAGASIN_ID", referencedColumnName = "ID", nullable = false)
    private Magasin magasinByMagasinId;
    @ManyToOne
    @JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
    private Employe employeByManagerId;
    @OneToMany(mappedBy = "employeByManagerId")
    private Collection<Employe> employesById;


    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
    }

    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employe employe = (Employe) o;
//
//        if (id != employe.id) return false;
//        if (actif != employe.actif) return false;
//        if (magasinId != employe.magasinId) return false;
//        if (prenom != null ? !prenom.equals(employe.prenom) : employe.prenom != null) return false;
//        if (nom != null ? !nom.equals(employe.nom) : employe.nom != null) return false;
//        if (email != null ? !email.equals(employe.email) : employe.email != null) return false;
//        if (telephone != null ? !telephone.equals(employe.telephone) : employe.telephone != null) return false;
//        if (managerId != null ? !managerId.equals(employe.managerId) : employe.managerId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
//        result = 31 * result + (nom != null ? nom.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
//        result = 31 * result + (int) actif;
//        result = 31 * result + magasinId;
//        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
//        return result;
//    }

    public Collection<Commande> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<Commande> commandesById) {
        this.commandesById = commandesById;
    }

    public Magasin getMagasinByMagasinId() {
        return magasinByMagasinId;
    }

    public void setMagasinByMagasinId(Magasin magasinByMagasinId) {
        this.magasinByMagasinId = magasinByMagasinId;
    }

    public Employe getEmployeByManagerId() {
        return employeByManagerId;
    }

    public void setEmployeByManagerId(Employe employeByManagerId) {
        this.employeByManagerId = employeByManagerId;
    }

    public Collection<Employe> getEmployesById() {
        return employesById;
    }

    public void setEmployesById(Collection<Employe> employesById) {
        this.employesById = employesById;
    }
}

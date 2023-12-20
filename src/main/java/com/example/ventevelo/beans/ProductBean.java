package com.example.ventevelo.beans;


import com.example.ventevelo.DAO.ProduitDAOImpl;
import com.example.ventevelo.model.production.Produit;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.bean.ViewScoped;
import jakarta.inject.Named;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ProductBean implements Serializable {


    public String hello = "hello";

    private ProduitDAOImpl produitImpl;

    @PostConstruct
    public void init() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProduction");
        EntityManager em = emf.createEntityManager();
        produitImpl = new ProduitDAOImpl(em);
//        products = produitImpl.findAll();
    }

    public List<Produit> getProducts() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProduction");
        EntityManager em = emf.createEntityManager();
        produitImpl = new ProduitDAOImpl(em);
        return produitImpl.findAll();
    }



    // Autres méthodes pour ajouter, modifier et supprimer des produits

}



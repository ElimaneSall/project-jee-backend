package com.example.ventevelo.DAO;

import com.example.ventevelo.model.production.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Tester {



    public static void main(String[] args)  {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProduction");
        EntityManager em = emf.createEntityManager();
        ProduitDAO productDao1 = new ProduitDAOImpl(em);

//        ProductBean productBean = new ProductBean();
//        List<Produit> produits = productDao1.findById(1);
        Produit produits = productDao1.findById(1);
//        for (Produit produit : produits) {
//            System.out.println(produit);
//        }

        System.out.println(produits);



    }
}

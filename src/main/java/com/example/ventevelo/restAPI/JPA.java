package com.example.ventevelo.restAPI;

import com.example.ventevelo.model.production.Produit;
import jakarta.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

    @Stateless
    public class JPA {
        public List<Produit> getAllProduct() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProduction");
            EntityManager em = emf.createEntityManager();
            List<Produit> produits = null;
            try {
                Query query = em.createQuery("SELECT p FROM Produit p");
                produits = query.getResultList();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
            return produits;
        }

    }

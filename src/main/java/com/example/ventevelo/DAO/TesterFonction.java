package com.example.ventevelo.DAO;

import com.example.ventevelo.model.production.Produit;
import javax.persistence.*;

import java.util.List;
import jakarta.ejb.Stateless;

@Stateless
public class TesterFonction {
    public List<Produit> getAllProduct() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
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

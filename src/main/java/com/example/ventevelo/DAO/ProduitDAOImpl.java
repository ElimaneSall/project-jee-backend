package com.example.ventevelo.DAO;

import com.example.ventevelo.model.production.Produit;

import javax.persistence.EntityManager;

public class ProduitDAOImpl extends GenericDAOImpl<Produit> implements ProduitDAO {
    public ProduitDAOImpl(EntityManager entityManager) {
        super(entityManager);
    }
    @Override
    protected Class<Produit> getEntityClass() {
        return Produit.class;
    }
}

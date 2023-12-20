//package com.example.velo.DAO;
//
//import com.example.velo.model.production.Produit;
//import jakarta.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import java.util.List;
//
//@Stateless
//public class ProductFacade extends AbstractFacade<Produit> {
//        @PersistenceContext(name = "puProduction")
//        private EntityManager em;
//
//        public ProductFacade() {
//            super(Produit.class);
//        }
//
//        @Override
//        protected EntityManager getEntityManager() {
//            return em;
//        }
//
//    }
//

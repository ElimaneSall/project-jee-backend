package com.example.ventevelo;

import com.example.ventevelo.DAO.ProduitDAO;
import com.example.ventevelo.DAO.ProduitDAOImpl;
import com.example.ventevelo.model.production.Produit;
import com.example.ventevelo.restAPI.JPA;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Path("/produit")
public class ProductRessource {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("puProduction");
    EntityManager em = emf.createEntityManager();
    ProduitDAO metier = new ProduitDAOImpl(em);

    @Path("/liste")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produit> produitList(){
        return metier.findAll();
    }
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Produit produitList( @PathParam("id") Integer id){
        return metier.findById(id);
    }
}

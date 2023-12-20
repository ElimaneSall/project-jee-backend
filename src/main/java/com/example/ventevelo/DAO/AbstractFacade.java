//package com.example.velo.DAO;
//
//
//import jakarta.persistence.Query;
//
//import javax.persistence.EntityManager;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//
//import java.util.List;
//
///**
// *
// * @author ssidibe
// */
//public abstract class AbstractFacade<T> {
//
//    private Class<T> entityClass;
//
//    public AbstractFacade(Class<T> entityClass) {
//        this.entityClass = entityClass;
//    }
//
//    protected abstract EntityManager getEntityManager();
//
//    public void create(T entity) {
//        getEntityManager().persist(entity);
//    }
//
//    public void edit(T entity) {
//        getEntityManager().merge(entity);
//    }
//
//    public void remove(T entity) {
//        getEntityManager().remove(getEntityManager().merge(entity));
//    }
//
//    public T find(Object id) {
//        return getEntityManager().find(entityClass, id);
//    }
//
//    public List<T> findAll() {
//        EntityManager entityManager = getEntityManager();
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityClass);
//        Root<T> root = criteriaQuery.from(entityClass);
//        criteriaQuery.select(root);
//
//        return entityManager.createQuery(criteriaQuery).getResultList();
//    }
//
//    public List<T> findRange(int[] range) {
//        EntityManager entityManager = getEntityManager();
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityClass);
//        Root<T> root = criteriaQuery.from(entityClass);
//        criteriaQuery.select(root);
//
//        javax.persistence.Query query =  entityManager.createQuery(criteriaQuery);
//        query.setMaxResults(range[1] - range[0] + 1);
//        query.setFirstResult(range[0]);
//
//        return query.getResultList();
//    }
//
////    public int count() {
////        jakarta.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
////        jakarta.persistence.criteria.Root<T> rt = cq.from(entityClass);
////        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
////        jakarta.persistence.Query q = getEntityManager().createQuery(cq);
////        return ((Long) q.getSingleResult()).intValue();
////    }
//
//}
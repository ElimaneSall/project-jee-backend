package com.example.ventevelo.DAO;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
        private EntityManager entityManager;
        public GenericDAOImpl(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        @Override
        public T findById(Integer id) {
            return entityManager.find(getEntityClass(), id);
        }

        @Override
        public List<T> findAll() {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> query = criteriaBuilder.createQuery(getEntityClass());
            Root<T> root = query.from(getEntityClass());
            query.select(root);
            return entityManager.createQuery(query).getResultList();
        }


        @Override
        public void save(T entity) {
            entityManager.persist(entity);
        }

        @Override
        public void update(T entity) {
            entityManager.merge(entity);
        }

        @Override
        public void delete(T entity) {
            entityManager.remove(entity);
        }

        protected abstract Class<T> getEntityClass();
    }



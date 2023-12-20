package com.example.ventevelo.DAO;


import java.util.List;

public interface GenericDAO<T> {
        T findById(Integer id);
        List<T> findAll();
        void save(T entity);
        void update(T entity);
        void delete(T entity);
    }



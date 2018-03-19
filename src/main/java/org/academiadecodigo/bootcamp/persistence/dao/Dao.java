package org.academiadecodigo.bootcamp.persistence.dao;

import org.academiadecodigo.bootcamp.model.User;

import java.util.List;

public interface Dao<T> {

    List<T> findAll();

    T findById(Integer id);

    void saveOrUpdate(T t);

    void delete(Integer id);

}

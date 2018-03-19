package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.persistence.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;




public abstract class JpaDao<T> implements Dao<T> {

    @PersistenceContext
    protected EntityManager em;

    private Class<T> modelType;

    public JpaDao(Class<T> t) {
        this.modelType = t;
    }


    @Override
    public List<T> findAll() {
        try {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = builder.createQuery(modelType);
            Root<T> root = criteriaQuery.from(modelType);
            criteriaQuery.select(root);
            //criteriaQuery.where(builder.equal(root.get("     "), modelType));
            return em.createQuery(criteriaQuery).getResultList();

        } catch (NoResultException e) {
            return null;
        }


    }

    @Override
    public T findById(Integer id) {
        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<T> criteriaQuery = builder.createQuery(modelType);

            Root<T> root = criteriaQuery.from(modelType);

            criteriaQuery.select(root);

            criteriaQuery.where(builder.equal(root.get("id"), id));

            return em.createQuery(criteriaQuery).getSingleResult();

        } catch (NoResultException ex) {
            return null;


        }
    }

    @Override
    public void saveOrUpdate(T t) {
        em.merge(t);
    }

    @Override
    public void delete(Integer id) {
        em.remove(id);

    }

}



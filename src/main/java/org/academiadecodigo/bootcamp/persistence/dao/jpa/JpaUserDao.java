package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.SessionManager;
import org.academiadecodigo.bootcamp.persistence.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaUserDao extends JpaDao<User> implements UserDao  {


    public JpaUserDao(){
        super(User.class);
    }

    /*public boolean authenticate(String name, String password) {


        try {

            TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.username = :username AND user.password = :password", User.class);
            query.setParameter("username", name);
            query.setParameter("password", password);
            query.getSingleResult();
            return true;

        } catch (NoResultException e) {
            return false;



        }
    }*/

    @Override
    public User findByName(String username) {

        try {


            TypedQuery<User> query = em.createQuery("select user from User user WHERE user.username = :username", User.class);
            query.setParameter("username", username);
            return query.getSingleResult();

        } catch (NoResultException e) {

            return null;

        }
/*
            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);

            Root<User> root = criteriaQuery.from(User.class);

            criteriaQuery.select(root);

            criteriaQuery.where(builder.equal(root.get("username"), username));

            return em.createQuery(criteriaQuery).getSingleResult();
*/
 }




    @Override
    public int count() {
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);

        Root<User> root = criteriaQuery.from(User.class);

        criteriaQuery.select(root);

        return em.createQuery(criteriaQuery).getResultList().size();
    }
}

package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.SessionManager;
import org.academiadecodigo.bootcamp.persistence.dao.BootcampDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class JpaBootcampDao extends JpaDao<Bootcamp> implements BootcampDao {

    public JpaBootcampDao(){
        super(Bootcamp.class);
}



    @Override
    public CodeCadet findCadet(CodeCadet codeCadet, int id) {


        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<CodeCadet> criteriaQuery = builder.createQuery(CodeCadet.class);

            Root<CodeCadet> root = criteriaQuery.from(CodeCadet.class);

            criteriaQuery.select(root);

            criteriaQuery.where(builder.equal(root.get("id"), id));

            return em.createQuery(criteriaQuery).getSingleResult();

        }catch (NoResultException e){
            return null;
        }
    }


}

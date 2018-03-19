package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.persistence.SessionManager;
import org.academiadecodigo.bootcamp.persistence.dao.CodeCadetDao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class JpaCodeCadetDao extends JpaDao<CodeCadet> implements CodeCadetDao {



    public JpaCodeCadetDao(){
        super(CodeCadet.class);

    }


    @Override
    public List<CodeCadet> findAll(Bootcamp bootcamp) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<CodeCadet> criteriaQuery = builder.createQuery(CodeCadet.class);
        Root<CodeCadet> root = criteriaQuery.from(CodeCadet.class);
        criteriaQuery.select(root);
        List<CodeCadet> codeCadets = em.createQuery(criteriaQuery).getResultList();
        return new ArrayList<>(codeCadets);
    }




}

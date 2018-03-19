package org.academiadecodigo.bootcamp.service.bootcamp;


import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.TransactionManager;
import org.academiadecodigo.bootcamp.persistence.dao.BootcampDao;
import org.academiadecodigo.bootcamp.persistence.dao.CodeCadetDao;
import org.academiadecodigo.bootcamp.persistence.dao.UserDao;
import org.academiadecodigo.bootcamp.service.bootcamp.BootcampService;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class JpaBootcampService implements BootcampService {



    private BootcampDao bootcampDao;
    private CodeCadetDao codeCadetDao;
    private TransactionManager tm;

    public JpaBootcampService(BootcampDao bootcampDao, CodeCadetDao codeCadetDao){
        this.codeCadetDao = codeCadetDao;
        this.bootcampDao = bootcampDao;
    }

    @Transactional
    @Override
    public Bootcamp findById(Integer id) {

            return bootcampDao.findById(id);

    }

    @Transactional
    @Override
    public void addBootcamp(Bootcamp bootcamp) {

            bootcampDao.saveOrUpdate(bootcamp);


    }

    @Transactional
    @Override
    public CodeCadet findCadet(CodeCadet codeCadet, int id) {

            return bootcampDao.findCadet(codeCadet, id);

    }

    @Transactional
    @Override
    public void addCadet(CodeCadet codeCadet, int id) {

            Bootcamp savedBootcamp = bootcampDao.findById(id);
            savedBootcamp.addCadet(codeCadet);
            bootcampDao.saveOrUpdate(savedBootcamp);

    }

    @Transactional
    @Override
    public List<Bootcamp> getAllBootcamps() {

            return bootcampDao.findAll();


    }

    @Transactional
    @Override
    public List<CodeCadet> getAllCadets(Bootcamp bootcamp) {

            return codeCadetDao.findAll(bootcamp);

    }
}

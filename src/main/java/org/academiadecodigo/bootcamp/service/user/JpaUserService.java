package org.academiadecodigo.bootcamp.service.user;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.TransactionManager;
import org.academiadecodigo.bootcamp.persistence.dao.UserDao;
import org.academiadecodigo.bootcamp.service.user.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JpaUserService implements UserService {

    private UserDao userDao;

    public JpaUserService(UserDao userDao) {
       this.userDao = userDao;

    }

    @Transactional
    @Override
    public boolean authenticate(String username, String password) {

            User user = userDao.findByName(username);

            return user != null && user.getPassword().equals(password);


    }

    @Transactional
    @Override
    public void addUser(User user) {

            userDao.saveOrUpdate(user);

    }

    @Transactional
    @Override
    public User findByName(String username) {

            return userDao.findByName(username);


    }

    @Transactional
    @Override
    public int count() {

            return userDao.count();

    }
}


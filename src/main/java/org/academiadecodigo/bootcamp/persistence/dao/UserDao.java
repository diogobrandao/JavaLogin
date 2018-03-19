package org.academiadecodigo.bootcamp.persistence.dao;

import org.academiadecodigo.bootcamp.model.User;

public interface UserDao extends Dao<User>{


    User findByName(String username);

    int count();


}

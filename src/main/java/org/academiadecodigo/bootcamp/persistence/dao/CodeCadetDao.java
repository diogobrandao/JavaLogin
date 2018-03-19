package org.academiadecodigo.bootcamp.persistence.dao;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;

import java.util.List;

public interface CodeCadetDao extends Dao<CodeCadet> {

List<CodeCadet> findAll(Bootcamp bootcamp);

}

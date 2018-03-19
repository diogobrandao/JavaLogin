package org.academiadecodigo.bootcamp.persistence.dao;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;

import java.util.ArrayList;
import java.util.List;

public interface BootcampDao extends Dao<Bootcamp> {


    CodeCadet findCadet(CodeCadet codeCadet, int id);





}

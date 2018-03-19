package org.academiadecodigo.bootcamp.service.bootcamp;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.service.Service;

import java.util.ArrayList;
import java.util.List;

public interface BootcampService extends Service {

    Bootcamp findById(Integer id);

    void addBootcamp(Bootcamp bootcamp);

    CodeCadet findCadet(CodeCadet codeCadet, int id);

    void addCadet(CodeCadet codeCadet,int id);

    List<Bootcamp> getAllBootcamps();

    List<CodeCadet> getAllCadets(Bootcamp bootcamp);


}

package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.Gender;
import org.academiadecodigo.bootcamp.model.User;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.HashMap;

public class Main1 {

    private EntityManagerFactory emf;
    public static void main(String[] args) {
           /*
        emf = Persistence.createEntityManagerFactory("test1");
        SessionManager sm = new SessionManager(emf);
        UserDao userDao = new JpaUserDao(sm);
        BootcampDao bootcampDao = new JpaBootcampDao(sm);
        CodeCadetDao codeCadetDao = new JpaCodeCadetDao(sm);
        TransactionManager tm = new JpaTrasanctionManager(sm);
        ServiceRegistry.getInstance().addService("UserService", new JpaUserService(tm,userDao));
        ServiceRegistry.getInstance().addService("BootcampService", new JpaBootcampService(tm, bootcampDao, codeCadetDao));
        */


           /*
        Navigation.getInstance().setStage(primaryStage);
        UserService us = (UserService) ServiceRegistry.getInstance().getServiceMap("UserService");
        BootcampService bs = (BootcampService) ServiceRegistry.getInstance().getServiceMap("BootcampService");
        Bootcamp bootcamp = new Bootcamp(1, "Lisbon", new Date(115, 3,12), new Date(116,6,14));
        Bootcamp bootcamp1 = new Bootcamp(2, "Terceira", new Date(114, 3, 14), new Date(117, 6,23));
        User user = new User("add", "add@", Security.getHash("lol"));
        User user1 = new User("add1", "add1@", Security.getHash("lol"));

        us.addUser(user);
        us.addUser(user1);

        CodeCadet codecadet = new CodeCadet("add",us.findByName("add"),Gender.MALE,"Pombal", "Lisboa", "963445345", new Date(91,2,3));
        System.out.println(us.findByName("add") + "****************************************");
        CodeCadet codecadet1 = new CodeCadet("add1", us.findByName("add1"), Gender.FEMALE, "Pombal Street", "Angra", "9655445", new Date(88, 5,4));
        CodeCadet codecadet2 = new CodeCadet("add2", us.findByName("add2"), Gender.MALE , "Praça da ", "Praia", "965345", new Date(91,2,3));

        bs.addBootcamp(bootcamp);
        bs.addBootcamp(bootcamp1);
        bs.addCadet(codecadet, 1);
        bs.addCadet(codecadet1, 2);
        bs.addCadet(codecadet2, 2);


        Navigation.getInstance().setStage(primaryStage);
        Navigation.getInstance().loadScreen("login");
        */




    }
}

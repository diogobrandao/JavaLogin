package org.academiadecodigo.bootcamp;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.Gender;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.bootcamp.BootcampService;
import org.academiadecodigo.bootcamp.service.user.UserService;
import org.academiadecodigo.bootcamp.utils.Security;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.Date;


public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void init() {



    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-config.xml");
        Navigation navigation = context.getBean("navigation", Navigation.class);
        navigation.setStage(primaryStage);
        navigation.loadScreen("login");

        /*
        Bootcamp bootcamp = new Bootcamp(1, "Lisbon", new Date(115, 3,12), new Date(116,6,14));

        UserService us = context.getBean("userService", UserService.class);
        BootcampService bs = context.getBean("bootcamp", BootcampService.class);
        User user = new User("add", "add@", Security.getHash("lol"));
        User user1 = new User("add1", "add1@", Security.getHash("lol"));
        us.addUser(user);
        us.addUser(user1);
        Bootcamp bootcamp1 = new Bootcamp(1, "Lisbon", new Date(115, 3,12), new Date(116,6,14));
        CodeCadet codecadet1 = new CodeCadet("add1", us.findByName("add1"), Gender.FEMALE, "Pombal Street", "Angra", "9655445", new Date(88, 5,4));
        bs.addBootcamp(bootcamp);
        bs.addCadet(codecadet1, 1);
        bootcamp.addCadet(codecadet1);
        */






    }

}



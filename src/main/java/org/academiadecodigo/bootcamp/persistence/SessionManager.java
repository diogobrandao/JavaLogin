package org.academiadecodigo.bootcamp.persistence;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public interface SessionManager {





void startSession();

    void stopSession();

    EntityManager getCurrentSession();
}

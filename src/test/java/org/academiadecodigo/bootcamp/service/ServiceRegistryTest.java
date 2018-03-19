package org.academiadecodigo.bootcamp.service;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ServiceRegistryTest {

    //private Service service = new ServiceRegistry();
    LinkedList<Service> services = new LinkedList<>();

/*
    @Before
   public void setup(){
        service = mock(Service.class);
    }
*/

    @Test
    public void testIfServiceGetsAdded(Service service){
        services.add(service);


    }

}
package com.Spring_JPA_Hibernate_2.InheritanceMapping.TablePerClass;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class NetflixRepositoryTest {

    @Autowired
    NetflixRepository netflixRep;

    @Ignore
    @Test
    void test(){
        Webseries w=new Webseries();
        w.setId(125);
        w.setName("Loki");
        w.setActor("Tom Huddleston");
        netflixRep.save(w);
    }

    @Ignore
    @Test
    void test2(){
        Movies w=new Movies();
        w.setId(123);
        w.setName("Loki");
        w.setActor("Tom Huddleston");
        netflixRep.save(w);
    }


}
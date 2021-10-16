package com.Spring_JPA_Hibernate_2.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;

@Entity
public class Movies extends Netflix{
    private String name;
    private String actor;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

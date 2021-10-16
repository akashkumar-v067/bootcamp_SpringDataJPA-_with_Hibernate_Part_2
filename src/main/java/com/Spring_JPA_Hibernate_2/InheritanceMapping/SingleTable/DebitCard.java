package com.Spring_JPA_Hibernate_2.InheritanceMapping.SingleTable;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value = "debit")
public class DebitCard extends Payment {

    private String debitnumber;


    public String getDebitnumber() {
        return debitnumber;
    }

    public void setDebitnumber(String debitnumber) {
        this.debitnumber = debitnumber;
    }
}

package com.Spring_JPA_Hibernate_2.InheritanceMapping.SingleTable;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("credit")
public class CreditCard extends Payment{

    private String creditnumber;

    public String getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(String creditnumber) {
        this.creditnumber = creditnumber;
    }
}

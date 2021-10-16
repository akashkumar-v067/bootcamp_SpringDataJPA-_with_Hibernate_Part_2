package com.Spring_JPA_Hibernate_2.InheritanceMapping.SingleTable;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class InheritanceMappingTest {

    @Autowired
    PaymentRepository payRep;

    @Ignore
    @Test
    void test1(){
        CreditCard d=new CreditCard();
        d.setId(28);
        d.setAmount(150000);
        d.setCreditnumber("154632789523");
        payRep.save(d);
    }
    @Ignore
    @Test
    void test2(){
        DebitCard d=new DebitCard();
        d.setId(21);
        d.setAmount(150000);
        d.setDebitnumber("154632789523");
        payRep.save(d);
    }



}
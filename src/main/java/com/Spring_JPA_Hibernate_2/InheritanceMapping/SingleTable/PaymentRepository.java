package com.Spring_JPA_Hibernate_2.InheritanceMapping.SingleTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PaymentRepository extends CrudRepository<Payment,Integer> {


}

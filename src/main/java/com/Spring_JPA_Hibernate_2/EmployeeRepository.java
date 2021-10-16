package com.Spring_JPA_Hibernate_2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import javax.persistence.ManyToOne;
import javax.transaction.Transactional;
import java.util.List;
@Component
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {


    @Query("from Employee")
    List<Employee> myfunction();

    //JPQL:
    //    1. Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    //    2. Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    //    3. Delete all employees with minimum salary.

    @Query("select firstName,lastName from Employee where salary > (select avg(salary) from Employee ) order by age asc, salary desc")
    List<Object[]> JpqlQ1();

    //jpql doest
    @Query("select avg(salary) from Employee")
    int avgSalary();

    @Modifying
    @Transactional
    @Query("update Employee set salary=:salary where salary<:avgsalary")
    void JpqlQ2(int salary, int avgsalary);

    @Modifying
    @Transactional
    @Query("delete Employee where salary<:minsalary")
    void JpqlQ3(@Param("minsalary") int minsalary);


    //Native SQL Query:
    //    1. Display the id, first name, age of all employees where last name ends with "singh"
    //    2. Delete all employees with age greater than 45(Should be passed as a parameter)

    @Query(value = "SELECT emp_id,emp_first_name,emp_age FROM employee_table WHERE emp_last_name LIKE '%singh'",nativeQuery = true)
    List<Object[]> NqQ1();

    @Modifying
    @Transactional
    @Query(value = "delete from employee_table where emp_age >:age",nativeQuery = true)
    void NqQ2(@Param("age") int age);









}

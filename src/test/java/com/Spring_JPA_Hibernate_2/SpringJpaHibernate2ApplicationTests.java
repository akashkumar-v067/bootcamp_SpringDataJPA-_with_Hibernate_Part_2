package com.Spring_JPA_Hibernate_2;


import com.Spring_JPA_Hibernate_2.InheritanceMapping.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringJpaHibernate2ApplicationTests {

	@Autowired
	EmployeeRepository empRep;

	@Test
	void contextLoads() {
	}
    @Ignore
	@Test
	void addEmployee(){
		Employee emp =new Employee();
		emp.setId(158);
		emp.setFirstName("bhavya");
		emp.setLastName("garg");
		emp.setAge(22);
		emp.setSalary(12000);
		empRep.save(emp);

	}
	@Ignore
	@Test
	void findsalary() {
		List<Employee> e = empRep.myfunction();
		System.out.println(e.toString() + "\n");
	}


	@Ignore
	@Test
	void quest(){
		List<Object[]> e= empRep.NqQ1();
        for (Object[] i:e){
			System.out.println(i[0]);
			System.out.println(i[1]);
			System.out.println(i[2]);
		}
	}

	@Ignore
	@Test
	void test4(){
		empRep.NqQ2(45);
		System.out.println("test passed");
	}

	@Ignore
	@Test
	void ques1(){
		List<Object[]> e= empRep.JpqlQ1();
		for (Object[] i:e){
			System.out.println(i[0]);
			System.out.println(i[1]);

		}
	}

	@Ignore
	@Test
	void test5(){
		int avgsalary =empRep.avgSalary();
		empRep.JpqlQ2(15000,avgsalary);
		System.out.println("test passed");
	}

	@Ignore
	@Test
	void test(){
		empRep.JpqlQ3(16000);
	}



}

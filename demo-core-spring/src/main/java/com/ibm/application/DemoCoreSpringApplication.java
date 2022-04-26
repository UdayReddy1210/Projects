package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.ibm.configuration.AppConfig;
import com.ibm.service.Customer;
// import com.ibm.configuration.EmployeeConfig;
import com.ibm.service.Employee;
import com.ibm.service.HelloWorld;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})   //scans stereotype annotation and create reference instance in string container
@Import({AppConfig.class})
@EnableAutoConfiguration
public class DemoCoreSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoCoreSpringApplication.class, args);
//		ConfigurableApplicationContext context  = SpringApplication.run(EmployeeConfig.class, args);
//		ConfigurableApplicationContext context1  = SpringApplication.run(AppConfig.class, args);
		ApplicationContext context=SpringApplication.run(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		Employee obj1 = (Employee) context.getBean("employeeBean");
		Customer obj2 = (Customer) context.getBean("customerBean");
//		obj.printHelloWorld("Spring 5 service working");
//		obj.createEmployee();
//		obj.createEmployee("EMP2");
		obj1.createEmployee();
		obj1.listEmployee();
		
//		ApplicationContext context1=SpringApplication.run(AppConfig.class);
//		HelloWorld hw = (HelloWorld) context1.getBean("helloBean");
		obj.printHelloWorld("Spring 5 up and running");
		obj2.createCustomer(1,"Park","Hyd",10001,"12/10/1998");
		obj2.listCustomer();
		obj2.createCustomer(5, "Raddison", "Delhi", 10005, "12/10/1998");
		obj2.updateCustomer(5, "Marriot", "Pune", 10005, "12/10/1998");
		obj2.deleteCustomer(2);
		obj2.listCustomer();


	}

}

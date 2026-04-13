package com.aastha;

import com.aastha.entity.Employee;
import com.aastha.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
	EmployeeService service=context.getBean(EmployeeService.class);
//	service.saveEmployee();
//
	//multiple record insertion
//		service.saveMultipleEmployee();
		//get
//
		//multiple
//		service.getEmps();
		//allprint
		service.getAllEmps();
	}




}

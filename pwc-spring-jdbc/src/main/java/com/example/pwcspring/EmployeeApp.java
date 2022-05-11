package com.example.pwcspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class EmployeeApp {
@Autowired
   private EmployeeDao dao;

   @RequestMapping("/")
   public String addEmployee() {
	   Employee emp=new Employee("pavan1","pavan@mail.come","nlre");
	   dao.insertEmployee(emp);
	   
	   return "employee added";
   }

	
}


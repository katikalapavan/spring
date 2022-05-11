package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;

@RestController
public class EmpController {
private static Map<String, List<Department>> empDB=new HashMap<String,List<Department>>();
static List<Department> lst =new ArrayList<Department>();
static {
	empDB=new HashMap <String,List<Department>>();
	
	Department emp=new Department("IT","Gopu");
	lst.add(emp);
	emp=new Department("IT!","Gopu2");
	lst.add(emp);
	empDB.put("hod", lst);
	
	
	
	lst =new ArrayList<Department>();
	 emp=new Department("mahesh11","slr");
	lst.add(emp);
	emp=new Department("john1","slr21");
	lst.add(emp);
	empDB.put("hod1", lst);
	
	
	
}


@GetMapping("/loadmap1/{location}")
public List<Department> loadEmp(@PathVariable("location") String location){
	List<Department> emplist=empDB.get(location);
	if(emplist==null) {
		emplist=new ArrayList<Department>();
		Department emp=new Department("NA","NOT FOUND");
		emplist.add(emp);
	}
	return emplist;
}
@GetMapping("/loademp1")
public List<Department> loadEmp(){
	return lst;
	}



}

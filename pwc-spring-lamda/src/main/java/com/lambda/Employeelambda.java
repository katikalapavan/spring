package com.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Employeelambda implements RequestHandler<Object,Employee>{

	@Override
	public Employee handleRequest(Object input, Context context) {
		//String message="Welcome to gateway app";
		//System.out.println(message);
		Employee emp=new Employee(1,"pavan","nellore","king@gmail.com");
		//GatewayResponse response=new GatewayResponse(emp,200,Collections.singletonMap("powered-by", "PWC-US"));
		return emp;
	}

}




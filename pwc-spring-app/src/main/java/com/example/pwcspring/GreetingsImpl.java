package com.example.pwcspring;

import org.springframework.stereotype.Component;

@Component("gi")
public class GreetingsImpl implements welcome{
	@Override
public void sayGreetings(String name) {
	
	System.out.println("pavan " + "welcome to AOP");
}

	@Override
	public void sayGreetings1(String name,String city) {
		// TODO Auto-generated method stub
		System.out.println("city " + "Nellore");
	}
}

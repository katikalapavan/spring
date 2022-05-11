package com.example.pwcspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AopAdvice {
	/*
	 * @Before(
	 * value="execution(* com.example.pwcspring.GreetingsImpl.sayGreetings(..))")
	 * public void callBefore() { System.out.println("calling before"); }
	 * 
	 * @After(
	 * value="execution(* com.example.pwcspring.GreetingsImpl.sayGreetings1(..))")
	 * public void callAfter() { System.out.println("calling after");
	 * 
	 * }
	 */
	
	@Around(value="execution(* com.example.pwcspring.GreetingsImpl.sayGreetings1(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("calling before");
		pj.proceed();
		System.out.println("calling After");
	
	}
}

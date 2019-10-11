package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	//define four methods
	 @Pointcut("execution(* *.perform(..))")
	//@Pointcut("execution(void* *.perform(..)")
	//@Pointcut("execution(void com.zensar.spring.performers.perform .perform(..)")
	//@Pointcut("execution(public void com.zensar.spring.performers.perform .perform(..)")
	public void performancePointCut() {}
	 @Before("performancePointCut()")
	public void takeSeats()
	{
		System.out.println("Audience is taking their seats");
	}
	 @Before("execution(* *.perform(..))")
	public void switchOffCellphones()
	{
		System.out.println("Audience is switching off their cellphones");
	}
	 @AfterReturning("performancePointCut()")
	public void applaud()
	{
		System.out.println("CLAP CLAP CLAP");
	}
	 @AfterThrowing("performancePointCut()")
	public void demandRefund()
	{
		System.out.println("Give me money back!!!");
	}
	

}

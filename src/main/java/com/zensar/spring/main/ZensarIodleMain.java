package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.exceptions.PerformanceException;
import com.zensar.spring.performers.Performer;

public class ZensarIodleMain {
	public static void main(String[] args)
	{
		
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p=ctx.getBean("devi", Performer.class);
		try {
			p.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("devi")
public class Juggler implements Performer {
	@Value("5")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		if(beanBags<3)
		{
			throw new PerformanceException("less number of beanbags");
		}
		else
		{
			System.out.println("juggler juggling beanbags"  + beanBags);
		}

	}

}

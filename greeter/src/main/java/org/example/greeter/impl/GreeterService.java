package org.example.greeter.impl;

import java.util.ArrayList;
import java.util.List;

import org.example.greeter.service.Greeter;

public class GreeterService {

	private List<Greeter> greeters = new ArrayList<Greeter>();
	
	public void listGreetings()
	{
		for (Greeter greeter : greeters) {
			System.out.println(greeter.greet());
		}
	}
}

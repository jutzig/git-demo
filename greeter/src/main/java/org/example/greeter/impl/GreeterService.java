package org.example.greeter.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.example.greeter.service.Greeter;

@Component
public class GreeterService {

	@Reference(referenceInterface=Greeter.class,bind="addGreeter",unbind="removeGreeter",cardinality=ReferenceCardinality.MANDATORY_MULTIPLE,policy=ReferencePolicy.DYNAMIC)
	private List<Greeter> greeters = new ArrayList<Greeter>();
	
	public void listGreetings()
	{
		for (Greeter greeter : greeters) {
			System.out.println(greeter.greet());
		}
	}
	
	protected void addGreeter(Greeter greeter){
		System.out.println("Adding greeter "+greeter);
		System.out.println(greeter.greet());
	}
	
	protected void removeGreeter(Greeter greeter) {
		System.out.println("Removing greeter "+greeter);
	}
}

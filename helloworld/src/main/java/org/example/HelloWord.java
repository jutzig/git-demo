package org.example;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.example.greeter.service.Greeter;

/**
 * I see javadoc
 * @author utzig
 *
 */
@Component
@Service
public class HelloWord implements Greeter{

	public String sayHello()
	{
		return "Hello World";
	}

	public String greet() {
		return sayHello();
	}

}
